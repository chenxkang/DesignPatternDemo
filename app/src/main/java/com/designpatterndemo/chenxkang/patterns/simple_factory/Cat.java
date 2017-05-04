package com.designpatterndemo.chenxkang.patterns.simple_factory;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.factory_method.FactoryMethodFragment.FMP_TAG;

/**
 * author: chenxkang
 * time  : 17/4/7
 * desc  : 猫类
 */

public class Cat implements Animal {

    @Override
    public void introduce(){
        Log.i(FMP_TAG, "我养了一只猫，它叫喵喵。");
    }

    @Override
    public void eatFood(){
        Log.i(FMP_TAG, "猫喜欢吃鱼！");
    }

}
