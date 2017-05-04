package com.designpatterndemo.chenxkang.principles.SRP;

import android.util.Log;

import static com.designpatterndemo.chenxkang.principles.SRP.SRPFragment.SRP_TAG;

/**
 * author: chenxkang
 * time  : 17/4/1
 * desc  : 介绍动物的栖息地和食物
 */

public class Recommend {

    /**
     * 牛羊猪的栖息地和食物
     *
     * @param animal  动物
     */
    public void rede(String animal){
        if (animal.equals("猪"))
            Log.i(SRP_TAG, animal + "生活在陆地上, 吃的是五谷杂粮。");
        else
            Log.i(SRP_TAG, animal + "生活在陆地上, 吃的是青草。");
    }

    /**
     * 鱼的栖息地和食物
     *
     * @param animal  动物
     */
    public void rede1(String animal){
        Log.i(SRP_TAG, animal + "生活在水里, 吃的是微生物。");
    }
}
