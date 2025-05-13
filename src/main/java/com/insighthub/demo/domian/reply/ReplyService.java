package com.insighthub.demo.domian.reply;

import java.util.List;

public interface ReplyService {
    ReplyEntity createReply(ReplyEntity reply);
    ReplyEntity getReplyById(Long id);
    List<ReplyEntity> getRepliesByBoardId(Long boardId);
    ReplyEntity updateReply(Long id, ReplyEntity reply);
    void deleteReply(Long id);
} 