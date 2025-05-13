package com.insighthub.demo.domian.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public BoardEntity createBoard(BoardEntity board) {
        return boardRepository.save(board);
    }

    @Override
    public BoardEntity getBoardById(Long id) {
        return boardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Board not found with id: " + id));
    }

    @Override
    public List<BoardEntity> getAllBoards() {
        return boardRepository.findAll();
    }

    @Override
    public BoardEntity updateBoard(Long id, BoardEntity board) {
        BoardEntity existingBoard = getBoardById(id);
        existingBoard.setTitle(board.getTitle());
        existingBoard.setContent(board.getContent());
        return boardRepository.save(existingBoard);
    }

    @Override
    public void deleteBoard(Long id) {
        boardRepository.deleteById(id);
    }
} 