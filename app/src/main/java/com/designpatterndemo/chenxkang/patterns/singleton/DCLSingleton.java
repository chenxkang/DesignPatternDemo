package com.designpatterndemo.chenxkang.patterns.singleton;

/**
 * author: chenxkang
 * time  : 17/4/11
 * desc  : 双重校验锁 实现单例
 */

public class DCLSingleton {

    private volatile static DCLSingleton instance;

    private DCLSingleton() {
    }

    public static DCLSingleton getInstance() {
        if (instance == null){
            synchronized (DCLSingleton.class){
                if (instance == null){
                    instance = new DCLSingleton();
                }
            }
        }

        return instance;
    }
}
