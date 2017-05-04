package com.designpatterndemo.chenxkang.principles.ISP;

import android.util.Log;

import static com.designpatterndemo.chenxkang.principles.ISP.ISPFragment.ISP_TAG;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : 座机，功能有：有线、拨打电话
 */

public class Phone implements ICommon {

    @Override
    public void wired() {
        Log.i(ISP_TAG, "Phone_wired: 有线");
    }

    @Override
    public void sendMessage() {

    }

    @Override
    public void calling() {
        Log.i(ISP_TAG, "Phone_calling: 拨打电话");
    }

    @Override
    public void listenToMusic() {

    }

    @Override
    public void watchVideos() {

    }
}
