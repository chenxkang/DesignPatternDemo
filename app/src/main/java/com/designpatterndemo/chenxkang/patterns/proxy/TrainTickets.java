package com.designpatterndemo.chenxkang.patterns.proxy;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.proxy.ProxyFragment.PROXY_TAG;

/**
 * author: chenxkang
 * time  : 17/4/26
 * desc  : 火车站购票
 */

public class TrainTickets implements BuyTickets {

    @Override
    public void request() {
        this.buy();
        this.refund();
        this.getPaper();
    }

    @Override
    public void buy() {
        Log.i(PROXY_TAG, "购票");
    }

    @Override
    public void refund() {
        Log.i(PROXY_TAG, "退票");
    }

    @Override
    public void getPaper() {
        Log.i(PROXY_TAG, "纸质票");
    }

    @Override
    public void getElectronic() {
        Log.i(PROXY_TAG, "电子票");
    }
}
