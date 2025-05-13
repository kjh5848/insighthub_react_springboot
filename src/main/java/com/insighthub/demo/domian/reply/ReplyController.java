package com.insighthub.demo.domian.reply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/replies")
public class ReplyController {

    @Autowired
    private ReplyService replyService;

    @PostMapping
    public ResponseEntity<ReplyEntity> createReply(@RequestBody ReplyEntity reply) {
        return ResponseEntity.ok(replyService.createReply(reply));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReplyEntity> getReply(@PathVariable Long id) {
        return ResponseEntity.ok(replyService.getReplyById(id));
    }

    @GetMapping("/board/{boardId}")
    public ResponseEntity<List<ReplyEntity>> getRepliesByBoard(@PathVariable Long boardId) {
        return ResponseEntity.ok(replyService.getRepliesByBoardId(boardId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReplyEntity> updateReply(@PathVariable Long id, @RequestBody ReplyEntity reply) {
        return ResponseEntity.ok(replyService.updateReply(id, reply));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReply(@PathVariable Long id) {
        replyService.deleteReply(id);
        return ResponseEntity.ok().build();
    }
} 