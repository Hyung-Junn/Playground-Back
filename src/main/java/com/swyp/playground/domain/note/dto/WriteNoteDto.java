package com.swyp.playground.domain.note.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WriteNoteDto {

    private String targetNickname;

    private String content;

    private String writtenBy;
    
}
