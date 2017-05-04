package com.designpatterndemo.chenxkang.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * author: chenxkang
 * time  : 17/5/4
 * desc  : 抽象被观察者
 */

public abstract class Subject {

    // 观察者集合
    protected List<Observer> observers = new ArrayList<>();

    // 注册
    public void register(Observer observer){
        observers.add(observer);
    }

    // 注销
    public void unregister(Observer observer){
        observers.remove(observer);
    }

    // 声明一个抽象的通知方法
    public abstract void renew(Metadata data);

}
