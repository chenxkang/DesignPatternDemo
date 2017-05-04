package com.designpatterndemo.chenxkang.patterns.mediator;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.mediator.MediatorFragment.MEDIATOR_TAG;

/**
 * author: chenxkang
 * time  : 17/5/2
 * desc  : 具体中介类02
 */

public class ConcreteMediator02 extends Mediator {

    @Override
    public void operation(Colleague colleague, String task) {
        Log.i(MEDIATOR_TAG, "中介者02转发任务：" + task);
        colleague.doTask(task);
    }

    @Override
    public void operation(String task) {
        Log.i(MEDIATOR_TAG, "中介者02转发任务到所有注册者：" + task);
        if (colleagues.size() == 0){
            return;
        }

        for (Colleague colleague : colleagues){
            colleague.doTask(task);
        }
    }

}
