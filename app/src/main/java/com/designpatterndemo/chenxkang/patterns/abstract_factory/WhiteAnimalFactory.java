package com.designpatterndemo.chenxkang.patterns.abstract_factory;

/**
 * author: chenxkang
 * time  : 17/4/11
 * desc  : 具体工厂类，生产白狗和白猫
 */

public class WhiteAnimalFactory implements AnimalFactory {

    @Override
    public IDog keepDog() {
        return new WhiteDog();
    }

    @Override
    public ICat keepCat() {
        return new WhiteCat();
    }

}
