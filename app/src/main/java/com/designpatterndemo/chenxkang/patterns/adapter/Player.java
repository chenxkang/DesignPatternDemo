package com.designpatterndemo.chenxkang.patterns.adapter;

/**
 * author: chenxkang
 * time  : 17/4/18
 * desc  :
 */

public interface Player {

    /**
     * 播放目标文件
     *
     * @param type     文件格式
     * @param content  文件内容
     */
    void play(String type, String content);
}
