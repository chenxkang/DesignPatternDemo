package com.designpatterndemo.chenxkang.patterns.builder;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  : 螺旋薯条，14元
 */

public class ScrewFrenchFries extends BaseFood {

    @Override
    String foodName() {
        return "螺旋薯条";
    }

    @Override
    float foodPrice() {
        return 14.0f;
    }

}
