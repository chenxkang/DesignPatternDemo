package com.designpatterndemo.chenxkang.patterns.mediator;

/**
 * author: chenxkang
 * time  : 17/5/2
 * desc  : 抽象同事类
 */

public abstract class Colleague {

    // 持有一个抽象中介者的引用
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    // 声明自身的方法，处理自己的行为
    public abstract void doTask(String task);

    // 定义依赖方法，与中介者进行通信
    public void sendTask(Colleague colleague, String task){
        mediator.operation(colleague, task);
    }

    // 定义依赖方法，通过中介者与所有其它对象进行通信
    public void sendTaskToAll(String task){
        mediator.operation(task);
    }

}
