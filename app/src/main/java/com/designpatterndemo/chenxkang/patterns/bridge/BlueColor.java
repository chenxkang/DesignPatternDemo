package com.designpatterndemo.chenxkang.patterns.bridge;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.bridge.BridgeFragment.BRIDGE_TAG;

/**
 * author: chenxkang
 * time  : 17/4/19
 * desc  :
 */

public class BlueColor implements ColorImp {

    @Override
    public void drawColor() {
        // do something
        Log.i(BRIDGE_TAG, "您选择了蓝色蜡笔");
    }

    @Override
    public String getColor() {
        return "蓝色";
    }
}
