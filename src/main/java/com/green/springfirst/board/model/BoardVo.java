package com.green.springfirst.board.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BoardVo {
    private int iboard;
    private String title;
    private String writer;
    private String createdAt;
}
