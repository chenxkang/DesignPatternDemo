package com.designpatterndemo.chenxkang.patterns.memento;

/**
 * author: chenxkang
 * time  : 17/5/2
 * desc  : 原发器类，包含一些用于存储成员数据的属性
 */

public class Originator {

    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 保存
    public Memento saveMemento(){
        return new Memento(state);
    }

    // 恢复
    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }

}
