package com.designpatterndemo.chenxkang.principles.ISP;

import android.util.Log;

import static com.designpatterndemo.chenxkang.principles.ISP.ISPFragment.ISP_TAG;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : (优化后)富人使用手机 发送短信、拨打电话、听音乐和看视频
 */

public class WealthMan1 {

    public void sendMsg(ICommon3 common){
        Log.i(ISP_TAG, "WealthMan1_sendMsg");
        common.sendMessage();
    }

    public void call(ICommon2 common){
        Log.i(ISP_TAG, "WealthMan1_call");
        common.calling();
    }

    public void music(ICommon3 common){
        Log.i(ISP_TAG, "WealthMan1_music");
        common.listenToMusic();
    }

    public void video(ICommon3 common){
        Log.i(ISP_TAG, "WealthMan1_video");
        common.watchVideos();
    }
}
