package com.designpatterndemo.chenxkang.patterns.proxy;

/**
 * author: chenxkang
 * time  : 17/4/26
 * desc  : 购票代理类
 */

public class ProxyBuyTickets implements BuyTickets {

    private String method;
    private BuyTickets buyTickets;

    public ProxyBuyTickets(String method) {
        this.method = method;
        this.buyTickets = new TrainTickets();
    }

    @Override
    public void request() {
        if (method.equals("train")){
            this.buy();
            this.refund();
            this.getPaper();
        } else if (method.equals("agency")){
            this.buy();
            this.getPaper();
        } else if (method.equals("net")){
            this.buy();
            this.refund();
            this.getElectronic();
        }
    }

    @Override
    public void buy() {
        buyTickets.buy();
    }

    @Override
    public void refund() {
        buyTickets.refund();
    }

    @Override
    public void getPaper() {
        buyTickets.getPaper();
    }

    @Override
    public void getElectronic() {
        buyTickets.getElectronic();
    }
}
