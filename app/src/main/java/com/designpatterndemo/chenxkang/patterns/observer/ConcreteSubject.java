package com.designpatterndemo.chenxkang.patterns.observer;

/**
 * author: chenxkang
 * time  : 17/5/4
 * desc  : 具体被观察者
 */

public class ConcreteSubject extends Subject {

    @Override
    public void renew(Metadata data) {
        // 遍历观察者集合，调用每一个观察者的相应方法
        for (Observer obs : observers){
            obs.update(data);
        }
    }
}
