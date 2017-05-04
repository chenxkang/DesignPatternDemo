package com.designpatterndemo.chenxkang.patterns.builder;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  : 超级鸡腿堡，16元
 */

public class SuperChickenBurger extends BaseFood {

    @Override
    String foodName() {
        return "超级鸡腿堡";
    }

    @Override
    float foodPrice() {
        return 16.0f;
    }
}
