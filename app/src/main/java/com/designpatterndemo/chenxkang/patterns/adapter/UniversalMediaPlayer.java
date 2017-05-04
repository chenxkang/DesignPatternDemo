package com.designpatterndemo.chenxkang.patterns.adapter;

/**
 * author: chenxkang
 * time  : 17/4/18
 * desc  : 通用播放器
 */

public class UniversalMediaPlayer implements Player {

    private MediaAdapter mediaAdapter;

    public UniversalMediaPlayer() {
        this.mediaAdapter = new MediaAdapter();
    }

    @Override
    public void play(String type, String content) {
        mediaAdapter.play(type, content);
    }

}
