package com.designpatterndemo.chenxkang.patterns.bridge;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.bridge.BridgeFragment.BRIDGE_TAG;

/**
 * author: chenxkang
 * time  : 17/4/19
 * desc  :
 */

public class Crayon extends PenAbstraction {

    public Crayon(ModelImp implModel, ColorImp implColor) {
        super(implModel, implColor);
    }

    @Override
    public void startDraw() {
        super.startDraw();

        Log.i(BRIDGE_TAG, "您要用" + getImplModel().getModel()
                + getImplColor().getColor() + "的蜡笔画一个什么呢？");
    }
}
