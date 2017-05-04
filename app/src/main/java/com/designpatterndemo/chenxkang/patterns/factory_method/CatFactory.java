package com.designpatterndemo.chenxkang.patterns.factory_method;

import com.designpatterndemo.chenxkang.patterns.simple_factory.Animal;
import com.designpatterndemo.chenxkang.patterns.simple_factory.Cat;

/**
 * author: chenxkang
 * time  : 17/4/10
 * desc  : Cat工厂类
 */

public class CatFactory implements AnimalFactory {

    @Override
    public Animal getAnimal() {
        return new Cat();
    }

}
