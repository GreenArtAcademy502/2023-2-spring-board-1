package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper mapper;

    public int postBoard(BoardInsDto dto) {
        return mapper.insBoard(dto);
    }

    public List<BoardVo> getBoard() {
        return mapper.selBoardList();
    }

    public BoardDetailVo getBoardById(int iboard) {
        return mapper.selBoardById(iboard);
    }

    public int delBoard(int iboard) {
        return mapper.delBoard(iboard);
    }
}
