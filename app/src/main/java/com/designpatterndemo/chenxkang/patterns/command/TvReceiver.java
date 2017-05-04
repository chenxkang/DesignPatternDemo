package com.designpatterndemo.chenxkang.patterns.command;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.command.CommandFragment.COMMAND_TAG;

/**
 * author: chenxkang
 * time  : 17/4/27
 * desc  : 接收者类
 */

public class TvReceiver {

    /**
     * 命令的真正实现
     *
     * @param action 操作指令
     */
    public void action(String action){
        Log.i(COMMAND_TAG, action + "的动作已完成");
    }

}
