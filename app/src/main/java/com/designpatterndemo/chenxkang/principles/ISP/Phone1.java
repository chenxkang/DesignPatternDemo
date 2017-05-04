package com.designpatterndemo.chenxkang.principles.ISP;

import android.util.Log;

import static com.designpatterndemo.chenxkang.principles.ISP.ISPFragment.ISP_TAG;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : (优化后)座机，功能有：有线、拨打电话
 */

public class Phone1 implements ICommon1,ICommon2 {

    @Override
    public void wired() {
        Log.i(ISP_TAG, "Phone1_wired: 有线");
    }

    @Override
    public void calling() {
        Log.i(ISP_TAG, "Phone1_calling: 拨打电话");
    }
}
