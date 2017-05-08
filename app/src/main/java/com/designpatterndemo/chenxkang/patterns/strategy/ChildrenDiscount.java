package com.designpatterndemo.chenxkang.patterns.strategy;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.strategy.StrategyFragment.STRATEGY_TAG;

/**
 * author: chenxkang
 * time  : 17/5/5
 * desc  : 儿童票
 */

public class ChildrenDiscount implements Discount {

    @Override
    public double calculate(double price) {
        Log.i(STRATEGY_TAG, "儿童票：半价");
        return price * 0.5;
    }

}
