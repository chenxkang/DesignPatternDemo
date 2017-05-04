package com.designpatterndemo.chenxkang.principles.SRP;

import android.util.Log;

import static com.designpatterndemo.chenxkang.principles.SRP.SRPFragment.SRP_TAG;

/**
 * author: chenxkang
 * time  : 17/4/1
 * desc  : 介绍动物的栖息地和食物(青草)
 */

public class Recommend01 {

    /**
     * 牛羊的栖息地和食物
     *
     * @param animal  动物
     */
    public void rede(String animal){
        Log.i(SRP_TAG, animal + "生活在陆地上, 吃的是青草。");
    }
}
