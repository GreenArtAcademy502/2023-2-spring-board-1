package com.green.springfirst.board;

import com.green.springfirst.ResVo;
import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardUpdDto;
import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    @PostMapping("/board")
    public ResVo postBoard(@RequestBody BoardInsDto dto) {
        System.out.println(dto);
        int result = service.postBoard(dto);
        System.out.println("result : " + result);
        return new ResVo(result);
    }

    @GetMapping("/board")
    public List<BoardVo> getBoard() {
        return service.getBoard();
    }

    @GetMapping("/board/{iboard}")
    public BoardDetailVo getBoardDetail(@PathVariable int iboard) {
        System.out.println(iboard);
        return service.getBoardById(iboard);
    }

    @PutMapping("/board")
    public ResVo putBoard(@RequestBody BoardUpdDto dto) {
        System.out.println(dto);
        int result = service.putBoard(dto);
        return new ResVo(result);
    }


    @DeleteMapping("/board/{iboard}")
    public ResVo delBoard(@PathVariable int iboard) {
        System.out.println(iboard);
        int result = service.delBoard(iboard);
        return new ResVo(result);
    }


}
