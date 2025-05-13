package com.insighthub.demo.domian.reply;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReplyRepository extends JpaRepository<ReplyEntity, Long> {
    List<ReplyEntity> findByBoardId(Long boardId);
} 