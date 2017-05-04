package com.designpatterndemo.chenxkang.patterns.factory_method;

import com.designpatterndemo.chenxkang.patterns.simple_factory.Animal;

/**
 * author: chenxkang
 * time  : 17/4/10
 * desc  : 宠物抽象工厂
 */

public interface AnimalFactory {

    /**
     * 获得具体产品对象
     *
     * @return
     */
    Animal getAnimal();

}
