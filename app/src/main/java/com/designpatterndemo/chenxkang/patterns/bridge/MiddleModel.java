package com.designpatterndemo.chenxkang.patterns.bridge;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.bridge.BridgeFragment.BRIDGE_TAG;

/**
 * author: chenxkang
 * time  : 17/4/19
 * desc  :
 */

public class MiddleModel implements ModelImp {

    @Override
    public void drawModel() {
        // do something
        Log.i(BRIDGE_TAG, "您选择了中号蜡笔");
    }

    @Override
    public String getModel() {
        return "中号";
    }
}
