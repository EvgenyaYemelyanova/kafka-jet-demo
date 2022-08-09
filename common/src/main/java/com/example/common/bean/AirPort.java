package com.example.common.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
public class  AirPort {
    private String name;
    private List<String> boards = new ArrayList<>();
    private int x;
    private int y;

    public void addBoard(String boardName) {
        int index = boards.indexOf(boardName);
        if(index >= 0) {
            boards.set(index, boardName);
        } else {
            boards.add(boardName);
        }
    }

    public void removeBoard(String boardName) {
        boards.remove(boardName);
    }
}
