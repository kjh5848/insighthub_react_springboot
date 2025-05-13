package com.insighthub.demo.domian.board;

import java.util.List;

public interface BoardService {
    BoardEntity createBoard(BoardEntity board);
    BoardEntity getBoardById(Long id);
    List<BoardEntity> getAllBoards();
    BoardEntity updateBoard(Long id, BoardEntity board);
    void deleteBoard(Long id);
} 