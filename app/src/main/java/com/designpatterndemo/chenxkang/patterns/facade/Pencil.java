package com.designpatterndemo.chenxkang.patterns.facade;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.facade.FacadeFragment.FACADE_TAG;

/**
 * author: chenxkang
 * time  : 17/4/25
 * desc  : 铅笔，素描
 */

public class Pencil implements Pen {

    @Override
    public void draw() {
        Log.i(FACADE_TAG, "铅笔素描");
    }

}
