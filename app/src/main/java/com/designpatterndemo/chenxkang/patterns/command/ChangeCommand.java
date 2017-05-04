package com.designpatterndemo.chenxkang.patterns.command;

/**
 * author: chenxkang
 * time  : 17/4/27
 * desc  :
 */

public class ChangeCommand implements Command {

    private TvReceiver receiver;

    public ChangeCommand(TvReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String action) {
        receiver.action(action);
    }
}
