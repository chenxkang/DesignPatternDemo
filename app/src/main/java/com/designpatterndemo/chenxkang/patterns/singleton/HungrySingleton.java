package com.designpatterndemo.chenxkang.patterns.singleton;

/**
 * author: chenxkang
 * time  : 17/4/11
 * desc  : 饿汉式单例类
 */

public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance(){
        return instance;
    }

}
