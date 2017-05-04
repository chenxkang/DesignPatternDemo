package com.designpatterndemo.chenxkang.patterns.iterator;

/**
 * author: chenxkang
 * time  : 17/4/28
 * desc  :
 */

public class Picture {

    private int pos;
    private String name;

    public Picture(int pos, String name) {
        this.pos = pos;
        this.name = name;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
