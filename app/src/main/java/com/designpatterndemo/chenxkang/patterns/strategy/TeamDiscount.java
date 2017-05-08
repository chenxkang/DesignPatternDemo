package com.designpatterndemo.chenxkang.patterns.strategy;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.strategy.StrategyFragment.STRATEGY_TAG;

/**
 * author: chenxkang
 * time  : 17/5/5
 * desc  : 团购票
 */

public class TeamDiscount implements Discount {

    @Override
    public double calculate(double price) {
        Log.i(STRATEGY_TAG, "团购票：优惠十元");
        return price - 10;
    }

}
