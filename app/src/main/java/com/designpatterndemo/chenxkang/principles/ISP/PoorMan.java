package com.designpatterndemo.chenxkang.principles.ISP;

import android.util.Log;

import static com.designpatterndemo.chenxkang.principles.ISP.ISPFragment.ISP_TAG;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : 穷人使用座机 有线、拨打电话
 */

public class PoorMan {

    public void isWired(ICommon common){
        Log.i(ISP_TAG, "PoorMan_isWired");
        common.wired();
    }

    public void call(ICommon common){
        Log.i(ISP_TAG, "PoorMan_call");
        common.calling();
    }
}
