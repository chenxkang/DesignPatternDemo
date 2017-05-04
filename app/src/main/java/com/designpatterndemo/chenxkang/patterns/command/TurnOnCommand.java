package com.designpatterndemo.chenxkang.patterns.command;

/**
 * author: chenxkang
 * time  : 17/4/27
 * desc  : 开电视的命令类
 */

public class TurnOnCommand implements Command {

    private TvReceiver receiver;

    public TurnOnCommand(TvReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String action) {
        receiver.action(action);
    }

}
