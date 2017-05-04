package com.designpatterndemo.chenxkang.patterns.builder;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  : 雪碧，8元
 */

public class SpriteBeverage extends BaseFood {

    @Override
    String foodName() {
        return "雪碧";
    }

    @Override
    float foodPrice() {
        return 8.0f;
    }
}
