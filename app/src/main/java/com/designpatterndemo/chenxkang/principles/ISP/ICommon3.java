package com.designpatterndemo.chenxkang.principles.ISP;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : 手机不同于座机的功能
 */

public interface ICommon3 {

    /**
     * 发送短信
     */
    void sendMessage();

    /**
     * 听音乐
     */
    void listenToMusic();

    /**
     * 观看视频
     */
    void watchVideos();
}
