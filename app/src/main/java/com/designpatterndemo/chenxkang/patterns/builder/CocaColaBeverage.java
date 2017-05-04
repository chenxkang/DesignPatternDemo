package com.designpatterndemo.chenxkang.patterns.builder;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  : 可口可乐，12元
 */

public class CocaColaBeverage extends BaseFood {

    @Override
    String foodName() {
        return "可口可乐";
    }

    @Override
    float foodPrice() {
        return 12.0f;
    }
}
