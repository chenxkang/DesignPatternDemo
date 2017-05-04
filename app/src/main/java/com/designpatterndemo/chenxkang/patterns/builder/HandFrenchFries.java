package com.designpatterndemo.chenxkang.patterns.builder;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  : 薯条书卷，10元
 */

public class HandFrenchFries extends BaseFood {

    @Override
    String foodName() {
        return "薯条书卷";
    }

    @Override
    float foodPrice() {
        return 10.0f;
    }
}
