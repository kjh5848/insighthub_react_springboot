package com.insighthub.demo.domian.reply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private ReplyRepository replyRepository;

    @Override
    public ReplyEntity createReply(ReplyEntity reply) {
        return replyRepository.save(reply);
    }

    @Override
    public ReplyEntity getReplyById(Long id) {
        return replyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reply not found with id: " + id));
    }

    @Override
    public List<ReplyEntity> getRepliesByBoardId(Long boardId) {
        return replyRepository.findByBoardId(boardId);
    }

    @Override
    public ReplyEntity updateReply(Long id, ReplyEntity reply) {
        ReplyEntity existingReply = getReplyById(id);
        existingReply.setContent(reply.getContent());
        return replyRepository.save(existingReply);
    }

    @Override
    public void deleteReply(Long id) {
        replyRepository.deleteById(id);
    }
} 