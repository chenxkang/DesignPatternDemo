package com.designpatterndemo.chenxkang.principles.DIP;

import android.util.Log;

import static com.designpatterndemo.chenxkang.principles.DIP.DIPFragment.DIP_TAG;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : 读者
 */

public class Reader {

    public void read(IRead reader){
        Log.i(DIP_TAG, "读者开始阅读");
        Log.i(DIP_TAG, "read: " + reader.getReadContent());
    }
}
