package com.designpatterndemo.chenxkang.patterns.chain_of_responsibility;

/**
 * author: chenxkang
 * time  : 17/4/27
 * desc  :
 */

public abstract class ChainHandler {

    private ChainHandler nextHandler;

    public ChainHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(ChainHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 自评分数
     * 审核标准：小于60分，由系统审核
     *          60～70分，由组长审核
     *          70～80分，由主管审核
     *          80～90分，有总监审核
     *          90～100分，由经理审核
     *
     * @param score 分数
     */
    public abstract void doHandler(double score);
}
