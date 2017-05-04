package com.designpatterndemo.chenxkang.patterns.builder;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  :  九珍果汁，10元
 */

public class FruitJuiceBeverage extends BaseFood {

    @Override
    String foodName() {
        return "九珍果汁";
    }

    @Override
    float foodPrice() {
        return 10.0f;
    }
}
