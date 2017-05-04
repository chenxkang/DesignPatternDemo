package com.designpatterndemo.chenxkang.principles.OCP;

import android.util.Log;

import static com.designpatterndemo.chenxkang.principles.OCP.OCPFragment.OCP_TAG;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : 工人
 */

public class Worker implements IWorker {

    @Override
    public void name(String name) {
        Log.i(OCP_TAG, "name: " + name);
    }

    @Override
    public void role(String role) {
        Log.i(OCP_TAG, "role: " + role);
    }

    @Override
    public void doing(String job) {
        Log.i(OCP_TAG, "doing: " + job);
    }
}
