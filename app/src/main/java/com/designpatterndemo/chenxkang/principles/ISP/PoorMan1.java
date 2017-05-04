package com.designpatterndemo.chenxkang.principles.ISP;

import android.util.Log;

import static com.designpatterndemo.chenxkang.principles.ISP.ISPFragment.ISP_TAG;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : (优化后)穷人使用座机 有线、拨打电话
 */

public class PoorMan1 {

    public void isWired(ICommon1 common){
        Log.i(ISP_TAG, "PoorMan1_isWired");
        common.wired();
    }

    public void call(ICommon2 common){
        Log.i(ISP_TAG, "PoorMan1_call");
        common.calling();
    }
}
