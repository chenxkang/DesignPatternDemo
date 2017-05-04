package com.designpatterndemo.chenxkang.patterns.builder;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  : 套餐类
 */

public class MealDirector {

    /**
     * 创建套餐A
     */
    public Meal getMealA(IMealBuilder builder){
        Meal meal_A;
        builder.buildChickenBurger();
        builder.buildFrenchFries();
        builder.buildBeverage();
        meal_A = builder.createMeal();
        return meal_A;
    }

    /**
     * 创建套餐B
     */
    public Meal getMealB(IMealBuilder builder){
        Meal meal_B;
        builder.buildChickenBurger();
        builder.buildFrenchFries();
        builder.buildBeverage();
        meal_B = builder.createMeal();
        return meal_B;
    }

    /**
     * 创建套餐C
     */
    public Meal getMealC(IMealBuilder builder){
        Meal meal_C;
        builder.buildChickenBurger();
        builder.buildFrenchFries();
        builder.buildBeverage();
        meal_C = builder.createMeal();
        return meal_C;
    }
}
