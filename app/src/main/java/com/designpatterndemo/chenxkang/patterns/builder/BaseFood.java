package com.designpatterndemo.chenxkang.patterns.builder;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  : 食物的基类，包含食物名称和价格
 */

abstract class BaseFood {

    /**
     * 食物名称
     *
     * @return
     */
    abstract String foodName();

    /**
     * 食物价格
     *
     * @return
     */
    abstract float foodPrice();

}
