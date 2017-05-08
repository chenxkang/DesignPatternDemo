package com.designpatterndemo.chenxkang.patterns.strategy;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.strategy.StrategyFragment.STRATEGY_TAG;

/**
 * author: chenxkang
 * time  : 17/5/5
 * desc  : 学生价
 */

public class StudentDiscount implements Discount {

    @Override
    public double calculate(double price) {
        Log.i(STRATEGY_TAG, "学生票：八折");
        return price * 0.8;
    }

}
