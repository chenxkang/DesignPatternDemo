package com.designpatterndemo.chenxkang.patterns.adapter;

/**
 * author: chenxkang
 * time  : 17/4/18
 * desc  :
 */

public interface AdvancedPlayer {

    /**
     * 播放avi格式的文件
     *
     * @param content 文件内容
     */
    void playAVI(String content);

    /**
     * 播放mp4格式的文件
     *
     * @param content 文件内容
     */
    void playMP4(String content);

}
