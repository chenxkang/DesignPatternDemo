package com.designpatterndemo.chenxkang.patterns.command;

/**
 * author: chenxkang
 * time  : 17/4/27
 * desc  :
 */

public class TurnOffCommand implements Command {

    private TvReceiver receiver;

    public TurnOffCommand(TvReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String action) {
        receiver.action(action);
    }
}
