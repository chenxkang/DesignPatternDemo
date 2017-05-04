package com.designpatterndemo.chenxkang.patterns.abstract_factory;

/**
 * author: chenxkang
 * time  : 17/4/11
 * desc  : 具体工厂类，生产黑狗和黑猫
 */

public class BlackAnimalFactory implements AnimalFactory {

    @Override
    public IDog keepDog() {
        return new BlackDog();
    }

    @Override
    public ICat keepCat() {
        return new BlackCat();
    }

}
