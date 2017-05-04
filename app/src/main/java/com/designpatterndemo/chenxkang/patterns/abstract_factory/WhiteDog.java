package com.designpatterndemo.chenxkang.patterns.abstract_factory;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.abstract_factory.AbstractFactoryFragment.AFP_TAG;

/**
 * author: chenxkang
 * time  : 17/4/11
 * desc  : 白狗
 */

public class WhiteDog implements IDog {

    /**
     * 空的构造方法
     */
    public WhiteDog() {
        introduce();
        eatFood();
    }

    @Override
    public void introduce() {
        Log.i(AFP_TAG, "我养了一条白狗，它叫白白。");
    }

    @Override
    public void eatFood() {
        Log.i(AFP_TAG, "白白爱吃骨头。");
    }

}
