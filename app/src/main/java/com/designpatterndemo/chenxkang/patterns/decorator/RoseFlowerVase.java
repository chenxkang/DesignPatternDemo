package com.designpatterndemo.chenxkang.patterns.decorator;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.decorator.DecoratorFragment.DECORATOR_TAG;

/**
 * author: chenxkang
 * time  : 17/4/24
 * desc  : 白色花瓶，插入了几支红玫瑰
 */

public class RoseFlowerVase extends FlowerVaseDecorator {

    public RoseFlowerVase(Vase vase) {
        super(vase);
    }

    @Override
    public void decorator() {
        super.decorator();
        setRoseFlower();
    }

    private void setRoseFlower() {
        Log.i(DECORATOR_TAG, "在白色的花瓶里插入了几支红玫瑰。");
    }

}
