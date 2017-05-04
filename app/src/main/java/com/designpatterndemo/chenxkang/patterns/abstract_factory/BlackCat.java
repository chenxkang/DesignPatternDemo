package com.designpatterndemo.chenxkang.patterns.abstract_factory;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.abstract_factory.AbstractFactoryFragment.AFP_TAG;

/**
 * author: chenxkang
 * time  : 17/4/11
 * desc  : 黑猫
 */

public class BlackCat implements ICat {

    /**
     * 空的构造方法
     */
    public BlackCat() {
        introduce();
        eatFood();
    }

    @Override
    public void introduce() {
        Log.i(AFP_TAG, "我养了一条黑猫，它叫喵喵。");
    }

    @Override
    public void eatFood() {
        Log.i(AFP_TAG, "喵喵爱吃鱼。");
    }

}
