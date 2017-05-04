package com.designpatterndemo.chenxkang.patterns.proxy;

/**
 * author: chenxkang
 * time  : 17/4/26
 * desc  : 抽象购票类
 */

public interface BuyTickets {

    /**
     * 发起购票请求
     *
     */
    void request();

    /**
     * 购票
     */
    void buy();

    /**
     * 退票
     */
    void refund();

    /**
     * 获取纸质票
     */
    void getPaper();

    /**
     * 获取电子票
     */
    void getElectronic();
}
