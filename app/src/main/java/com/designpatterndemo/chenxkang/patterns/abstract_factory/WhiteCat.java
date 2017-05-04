package com.designpatterndemo.chenxkang.patterns.abstract_factory;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.abstract_factory.AbstractFactoryFragment.AFP_TAG;

/**
 * author: chenxkang
 * time  : 17/4/11
 * desc  : 白猫
 */

public class WhiteCat implements ICat {

    /**
     * 空的构造方法
     */
    public WhiteCat() {
        introduce();
        eatFood();
    }

    @Override
    public void introduce() {
        Log.i(AFP_TAG, "我养了一条白猫，它叫呜呜。");
    }

    @Override
    public void eatFood() {
        Log.i(AFP_TAG, "呜呜爱吃鱼。");
    }

}
