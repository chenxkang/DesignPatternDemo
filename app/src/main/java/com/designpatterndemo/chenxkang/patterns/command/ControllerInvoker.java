package com.designpatterndemo.chenxkang.patterns.command;

/**
 * author: chenxkang
 * time  : 17/4/27
 * desc  :
 */

public class ControllerInvoker {

    private Command command;

    /**
     * 设置命令
     *
     * @param command 命令对象
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     *
     * @param action 操作指令
     */
    public void executeCommand(String action){
        command.execute(action);
    }

}
