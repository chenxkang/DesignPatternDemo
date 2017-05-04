package com.designpatterndemo.chenxkang.patterns.singleton;

/**
 * author: chenxkang
 * time  : 17/4/11
 * desc  : 静态内部类实现单例
 */

public class IDHSingleton {

    private IDHSingleton() {
    }

    private static class HolderClass{
        private final static IDHSingleton instance = new IDHSingleton();
    }

    public static IDHSingleton getInstance(){
        return HolderClass.instance;
    }

}
