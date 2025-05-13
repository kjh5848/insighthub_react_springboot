package com.insighthub.demo.domian.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @PostMapping
    public ResponseEntity<BoardEntity> createBoard(@RequestBody BoardEntity board) {
        return ResponseEntity.ok(boardService.createBoard(board));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BoardEntity> getBoard(@PathVariable Long id) {
        return ResponseEntity.ok(boardService.getBoardById(id));
    }

    @GetMapping
    public ResponseEntity<List<BoardEntity>> getAllBoards() {
        return ResponseEntity.ok(boardService.getAllBoards());
    }

    @PutMapping("/{id}")
    public ResponseEntity<BoardEntity> updateBoard(@PathVariable Long id, @RequestBody BoardEntity board) {
        return ResponseEntity.ok(boardService.updateBoard(id, board));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBoard(@PathVariable Long id) {
        boardService.deleteBoard(id);
        return ResponseEntity.ok().build();
    }
}