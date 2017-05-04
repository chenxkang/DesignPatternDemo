package com.designpatterndemo.chenxkang.patterns.chain_of_responsibility;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.chain_of_responsibility.ResponChainFragment.RESP_CHAIN_TAG;

/**
 * author: chenxkang
 * time  : 17/4/27
 * desc  : 小于60分，由系统审核
 */

public class SystemHandler extends ChainHandler {

    @Override
    public void doHandler(double score) {
        Log.i(RESP_CHAIN_TAG, "传递到了：系统");
        if (score < 60){
            Log.i(RESP_CHAIN_TAG, "审核人：系统；自评分数：" + score + "分；审核结果：不合格");
        } else {
            if (null != getNextHandler()){
                Log.i(RESP_CHAIN_TAG, "不属于系统的职责，继续传递。。。");
                getNextHandler().doHandler(score);
            } else {
                Log.i(RESP_CHAIN_TAG, "系统没有处理，无下一个处理人，终止传递。。。");
            }
        }
    }
}
