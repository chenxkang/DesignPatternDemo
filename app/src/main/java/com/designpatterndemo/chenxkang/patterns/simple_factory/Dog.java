package com.designpatterndemo.chenxkang.patterns.simple_factory;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.factory_method.FactoryMethodFragment.FMP_TAG;

/**
 * author: chenxkang
 * time  : 17/4/7
 * desc  : 狗类
 */

public class Dog implements Animal {

    @Override
    public void introduce() {
        Log.i(FMP_TAG, "我养了一条狗，它叫汪汪。");
    }

    @Override
    public void eatFood() {
        Log.i(FMP_TAG, "狗喜欢吃骨头！");
    }

}
