package com.designpatterndemo.chenxkang.patterns.simple_factory;

/**
 * author: chenxkang
 * time  : 17/4/7
 * desc  : 宠物工厂类
 */

public class AnimalFactory {

    /**
     * 获得宠物的对象
     *
     * @param animal dog：狗；cat：猫
     * @return
     */
    public Animal getAnimal(String animal){

        if (animal.equals("dog")) {
            return new Dog();
        } else if (animal.equals("cat")) {
            return new Cat();
        }

        return null;
    }
}
