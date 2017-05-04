package com.designpatterndemo.chenxkang.patterns.builder;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  : 香辣鸡腿堡，12元
 */

public class SpicyChickenBurger extends BaseFood {

    @Override
    String foodName() {
        return "香辣鸡腿堡";
    }

    @Override
    float foodPrice() {
        return 12.0f;
    }
}
