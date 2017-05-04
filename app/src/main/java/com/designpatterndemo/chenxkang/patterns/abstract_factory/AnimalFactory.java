package com.designpatterndemo.chenxkang.patterns.abstract_factory;

/**
 * author: chenxkang
 * time  : 17/4/11
 * desc  : 抽象工厂类
 */

public interface AnimalFactory {

    /**
     * 养狗
     */
    IDog keepDog();

    /**
     * 养猫
     */
    ICat keepCat();

}
