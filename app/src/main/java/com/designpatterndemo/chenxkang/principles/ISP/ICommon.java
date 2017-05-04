package com.designpatterndemo.chenxkang.principles.ISP;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : 单一的接口
 */

public interface ICommon {

    /**
     * 有线
     */
    void wired();

    /**
     * 发送短信
     */
    void sendMessage();

    /**
     * 拨打电话
     */
    void calling();

    /**
     * 听音乐
     */
    void listenToMusic();

    /**
     * 观看视频
     */
    void watchVideos();

}
