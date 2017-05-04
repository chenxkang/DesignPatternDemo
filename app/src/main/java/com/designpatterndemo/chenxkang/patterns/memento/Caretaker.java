package com.designpatterndemo.chenxkang.patterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * author: chenxkang
 * time  : 17/5/2
 * desc  : 负责人类，用于保存备忘录对象，并提供方法来返回一个备忘录对象，原发器可以通过使用这个备忘录对象回到某个历史状态
 */

public class Caretaker {

    private List<Memento> mementos = new ArrayList<>();

    public Memento getMemento(int i) {
        return mementos.get(i);
    }

    public void setMemento(Memento memento) {
        this.mementos.add(memento);
    }

}
