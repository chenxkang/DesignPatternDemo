package com.designpatterndemo.chenxkang.patterns.builder;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  : 香酥炸薯条，12元
 */

public class SpicyFrenchFries extends BaseFood {

    @Override
    String foodName() {
        return "香酥炸薯条";
    }

    @Override
    float foodPrice() {
        return 12.0f;
    }
}
