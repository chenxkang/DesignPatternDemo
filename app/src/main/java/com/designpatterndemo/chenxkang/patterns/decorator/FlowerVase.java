package com.designpatterndemo.chenxkang.patterns.decorator;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.decorator.DecoratorFragment.DECORATOR_TAG;

/**
 * author: chenxkang
 * time  : 17/4/24
 * desc  : 白色花瓶，无任何装饰
 */

public class FlowerVase implements Vase {

    @Override
    public void decorator() {
        Log.i(DECORATOR_TAG, "白色的花瓶");
    }

}
