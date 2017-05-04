package com.designpatterndemo.chenxkang.patterns.chain_of_responsibility;

/**
 * author: chenxkang
 * time  : 17/4/27
 * desc  : 责任链代理类
 */

public class ChainProxyHandler extends ChainHandler {

    private ChainHandler systemHandler;

    public ChainProxyHandler() {

        systemHandler = new SystemHandler();
        ChainHandler headmanHandler = new HeadmanHandler();
        ChainHandler chargeHandler = new ChargeHandler();
        ChainHandler chiefHandler = new ChiefHandler();
        ChainHandler managerHandler = new ManagerHandler();

        systemHandler.setNextHandler(headmanHandler);
        headmanHandler.setNextHandler(chargeHandler);
        chargeHandler.setNextHandler(chiefHandler);
        chiefHandler.setNextHandler(managerHandler);

    }

    @Override
    public void doHandler(double score) {
        systemHandler.doHandler(score);
    }
}
