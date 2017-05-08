package com.designpatterndemo.chenxkang.patterns.strategy;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.strategy.StrategyFragment.STRATEGY_TAG;

/**
 * author: chenxkang
 * time  : 17/5/5
 * desc  : VIP票
 */

public class VIPDiscount implements Discount {

    @Override
    public double calculate(double price) {
        Log.i(STRATEGY_TAG, "VIP票：四折");
        return price * 0.4;
    }

}
