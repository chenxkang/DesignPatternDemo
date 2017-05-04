package com.designpatterndemo.chenxkang.patterns.observer;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.observer.ObserverFragment.OBSERVER_TAG;

/**
 * author: chenxkang
 * time  : 17/5/4
 * desc  : 4次方
 */

public class Power4Observer implements Observer {

    @Override
    public void update(Metadata data) {
        int i = data.getData();
        Log.i(OBSERVER_TAG, i + "的4次方为: " + i*i*i*i);
    }

}
