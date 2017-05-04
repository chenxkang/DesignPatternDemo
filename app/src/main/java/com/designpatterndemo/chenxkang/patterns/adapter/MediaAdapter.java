package com.designpatterndemo.chenxkang.patterns.adapter;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.adapter.AdapterFragment.ADAPTER_TAG;

/**
 * author: chenxkang
 * time  : 17/4/18
 * desc  : 适配器类
 */

public class MediaAdapter implements Player {

    private AdvancedMediaPlayer advancedMediaPlayer;
    private Player mediaPlayer;

    public MediaAdapter() {
        this.advancedMediaPlayer = new AdvancedMediaPlayer();
        this.mediaPlayer = new MediaPlayer();
    }

    @Override
    public void play(String type, String content) {
        switch (type){
            case "mp3":
                mediaPlayer.play(type, content);
                break;
            case "avi":
                advancedMediaPlayer.playAVI(content);
                break;
            case "mp4":
                advancedMediaPlayer.playMP4(content);
                break;
            default:
                Log.i(ADAPTER_TAG, "抱歉！无法打开" + type + "格式的文件！");
        }
    }
}
