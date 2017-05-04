package com.designpatterndemo.chenxkang.patterns.chain_of_responsibility;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.chain_of_responsibility.ResponChainFragment.RESP_CHAIN_TAG;

/**
 * author: chenxkang
 * time  : 17/4/27
 * desc  :80～90分，有总监审核
 */

public class ChiefHandler extends ChainHandler {

    @Override
    public void doHandler(double score) {
        Log.i(RESP_CHAIN_TAG, "传递到了：总监");
        if (score >= 80 && score < 90){
            Log.i(RESP_CHAIN_TAG, "审核人：总监；自评分数：" + score + "分；审核结果：通过");
        } else {
            if (null != getNextHandler()){
                Log.i(RESP_CHAIN_TAG, "不属于总监的职责，继续传递。。。");
                getNextHandler().doHandler(score);
            } else {
                Log.i(RESP_CHAIN_TAG, "总监没有处理，无下一个处理人，终止传递。。。");
            }
        }
    }
}
