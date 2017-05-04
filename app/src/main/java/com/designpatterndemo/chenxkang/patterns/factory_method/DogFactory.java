package com.designpatterndemo.chenxkang.patterns.factory_method;

import com.designpatterndemo.chenxkang.patterns.simple_factory.Animal;
import com.designpatterndemo.chenxkang.patterns.simple_factory.Dog;

/**
 * author: chenxkang
 * time  : 17/4/10
 * desc  : Dog工厂类
 */

public class DogFactory implements AnimalFactory {

    @Override
    public Animal getAnimal() {
        return new Dog();
    }

}
