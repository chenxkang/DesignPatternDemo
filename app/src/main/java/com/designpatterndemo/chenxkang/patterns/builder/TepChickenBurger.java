package com.designpatterndemo.chenxkang.patterns.builder;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  : 板烧鸡腿堡，14元
 */

public class TepChickenBurger extends BaseFood {

    @Override
    String foodName() {
        return "板烧鸡腿堡";
    }

    @Override
    float foodPrice() {
        return 14.0f;
    }
}
