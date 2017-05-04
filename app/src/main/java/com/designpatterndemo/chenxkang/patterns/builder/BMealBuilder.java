package com.designpatterndemo.chenxkang.patterns.builder;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  : B套餐的具体建造者
 */

public class BMealBuilder implements IMealBuilder {

    private Meal meal;

    public BMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void buildChickenBurger() {
        meal.addFood(new TepChickenBurger());
    }

    @Override
    public void buildFrenchFries() {
        meal.addFood(new SpicyFrenchFries());
    }

    @Override
    public void buildBeverage() {
        meal.addFood(new FruitJuiceBeverage());
    }

    @Override
    public Meal createMeal() {
        return meal;
    }
}
