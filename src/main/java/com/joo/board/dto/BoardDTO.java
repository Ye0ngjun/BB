package com.joo.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String BoardPass;
    private String BoardTitle;
    private String BoardContents;
    private int BoardHits;

}
