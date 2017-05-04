package com.designpatterndemo.chenxkang.principles.ISP;

import android.util.Log;

import static com.designpatterndemo.chenxkang.principles.ISP.ISPFragment.ISP_TAG;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : 富人使用手机 发送短信、拨打电话、听音乐和看视频
 */

public class WealthMan {

    public void sendMsg(ICommon common){
        Log.i(ISP_TAG, "WealthMan_sendMsg");
        common.sendMessage();
    }

    public void call(ICommon common){
        Log.i(ISP_TAG, "WealthMan_call");
        common.calling();
    }

    public void music(ICommon common){
        Log.i(ISP_TAG, "WealthMan_music");
        common.listenToMusic();
    }

    public void video(ICommon common){
        Log.i(ISP_TAG, "WealthMan_video");
        common.watchVideos();
    }
}
