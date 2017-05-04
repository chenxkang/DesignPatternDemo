package com.designpatterndemo.chenxkang.patterns.mediator;

import java.util.ArrayList;

/**
 * author: chenxkang
 * time  : 17/5/2
 * desc  : 抽象中介者
 */

public abstract class Mediator {

    // 用于存储同事对象
    protected ArrayList<Colleague> colleagues = new ArrayList<>();

    // 注册方法，用于增加同事对象
    public void register(Colleague colleague){
        colleagues.add(colleague);
    }

    // 声明抽象的业务方法：指定与某同事进行通信
    public abstract void operation(Colleague colleague, String task);

    // 声明抽象的业务方法：向所有的注册者发送消息
    public abstract void operation(String task);

}
