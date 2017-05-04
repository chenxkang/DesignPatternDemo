package com.designpatterndemo.chenxkang.patterns.abstract_factory;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.abstract_factory.AbstractFactoryFragment.AFP_TAG;

/**
 * author: chenxkang
 * time  : 17/4/11
 * desc  : 黑狗
 */

public class BlackDog implements IDog {

    /**
     * 空的构造方法
     */
    public BlackDog() {
        introduce();
        eatFood();
    }

    @Override
    public void introduce() {
        Log.i(AFP_TAG, "我养了一条黑狗，它叫黑黑。");
    }

    @Override
    public void eatFood() {
        Log.i(AFP_TAG, "黑黑爱吃骨头。");
    }

}
