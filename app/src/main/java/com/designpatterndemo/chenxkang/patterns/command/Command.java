package com.designpatterndemo.chenxkang.patterns.command;

/**
 * author: chenxkang
 * time  : 17/4/27
 * desc  :
 */

public interface Command {

    /**
     * 执行操作
     *
     * @param action 操作指令
     */
    void execute(String action);

}
