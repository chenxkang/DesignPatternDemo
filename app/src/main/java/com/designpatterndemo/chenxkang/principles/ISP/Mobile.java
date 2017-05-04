package com.designpatterndemo.chenxkang.principles.ISP;

import android.util.Log;

import static com.designpatterndemo.chenxkang.principles.ISP.ISPFragment.ISP_TAG;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : 手机，功能有：发送短信、拨打电话、听音乐和观看视频
 */

public class Mobile implements ICommon {

    @Override
    public void wired() {

    }

    @Override
    public void sendMessage() {
        Log.i(ISP_TAG, "Mobile_sendMessage: 发送短信");
    }

    @Override
    public void calling() {
        Log.i(ISP_TAG, "Mobile_calling: 拨打电话");
    }

    @Override
    public void listenToMusic() {
        Log.i(ISP_TAG, "Mobile_listenToMusic: 听音乐");
    }

    @Override
    public void watchVideos() {
        Log.i(ISP_TAG, "Mobile_watchVideos: 观看视频");
    }
}
