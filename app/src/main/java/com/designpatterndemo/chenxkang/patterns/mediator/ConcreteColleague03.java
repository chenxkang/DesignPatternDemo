package com.designpatterndemo.chenxkang.patterns.mediator;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.mediator.MediatorFragment.MEDIATOR_TAG;

/**
 * author: chenxkang
 * time  : 17/5/2
 * desc  : 具体同事类03
 */

public class ConcreteColleague03 extends Colleague {

    public ConcreteColleague03(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void doTask(String task) {
        Log.i(MEDIATOR_TAG, "同事03处理任务：" + task);
    }

}
