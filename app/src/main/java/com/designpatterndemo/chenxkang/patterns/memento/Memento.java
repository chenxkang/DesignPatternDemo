package com.designpatterndemo.chenxkang.patterns.memento;

/**
 * author: chenxkang
 * time  : 17/5/2
 * desc  : 备忘录类，通常提供了与原发器相对应的属性用于存储原发器的状态
 */

public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
