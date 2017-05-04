package com.designpatterndemo.chenxkang.patterns.bridge;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.bridge.BridgeFragment.BRIDGE_TAG;

/**
 * author: chenxkang
 * time  : 17/4/19
 * desc  :
 */

public class SmallModel implements ModelImp {

    @Override
    public void drawModel() {
        // do something
        Log.i(BRIDGE_TAG, "您选择了小号蜡笔");
    }

    @Override
    public String getModel() {
        return "小号";
    }
}
