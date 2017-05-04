package com.designpatterndemo.chenxkang.patterns.builder;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  : A套餐的具体建造者
 */

public class AMealBuilder implements IMealBuilder {

    private Meal meal;

    public AMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void buildChickenBurger() {
        meal.addFood(new SpicyChickenBurger());
    }

    @Override
    public void buildFrenchFries() {
        meal.addFood(new HandFrenchFries());
    }

    @Override
    public void buildBeverage() {
        meal.addFood(new SpriteBeverage());
    }

    @Override
    public Meal createMeal() {
        return meal;
    }

}
