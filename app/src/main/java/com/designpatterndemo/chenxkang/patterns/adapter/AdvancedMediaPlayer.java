package com.designpatterndemo.chenxkang.patterns.adapter;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.adapter.AdapterFragment.ADAPTER_TAG;

/**
 * author: chenxkang
 * time  : 17/4/18
 * desc  : 可以播放avi和mp4格式的播放器
 */

public class AdvancedMediaPlayer implements AdvancedPlayer {

    @Override
    public void playAVI(String content) {
        Log.i(ADAPTER_TAG, "文件格式：avi；" + "文件内容：" + content);
    }

    @Override
    public void playMP4(String content) {
        Log.i(ADAPTER_TAG, "文件格式：mp4；" + "文件内容：" + content);
    }

}
