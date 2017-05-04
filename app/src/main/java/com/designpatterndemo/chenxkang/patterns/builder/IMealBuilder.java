package com.designpatterndemo.chenxkang.patterns.builder;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  : 抽象建造者
 */

 interface IMealBuilder {

    /**
     * 鸡腿堡
     */
    void buildChickenBurger();

    /**
     * 薯条
     */
    void buildFrenchFries();

    /**
     * 饮料
     */
    void buildBeverage();

    /**
     * 返回创建结果
     */
    Meal createMeal();

}
