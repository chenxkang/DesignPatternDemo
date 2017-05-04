package com.designpatterndemo.chenxkang.patterns.mediator;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.mediator.MediatorFragment.MEDIATOR_TAG;

/**
 * author: chenxkang
 * time  : 17/5/2
 * desc  : 具体同事类02
 */

public class ConcreteColleague02 extends Colleague {

    public ConcreteColleague02(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void doTask(String task) {
        Log.i(MEDIATOR_TAG, "同事02处理任务：" + task);
    }

}
