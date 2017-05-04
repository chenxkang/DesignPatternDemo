package com.designpatterndemo.chenxkang.patterns.adapter;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.adapter.AdapterFragment.ADAPTER_TAG;

/**
 * author: chenxkang
 * time  : 17/4/18
 * desc  : 媒体播放器
 */

public class MediaPlayer implements Player {

    @Override
    public void play(String type, String content) {
        Log.i(ADAPTER_TAG, "文件格式：" + type + "；" + "文件内容：" + content);
    }

}
