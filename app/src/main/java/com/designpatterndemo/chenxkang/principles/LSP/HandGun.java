package com.designpatterndemo.chenxkang.principles.LSP;

import android.util.Log;

import static com.designpatterndemo.chenxkang.principles.LSP.LSPFragment.LSP_TAG;

/**
 * author: xiaokang
 * time  : 17/3/30
 * desc  : 手枪实现类
 */

public class HandGun extends BaseGun {

    public void handGunName(){
        Log.i(LSP_TAG, "士兵使用的武器是手枪");
    }

    @Override
    public void gunZoom(){
        handGunName();
        Log.i(LSP_TAG, "手枪小，便于携带");
    }

    @Override
    public void characteristic() {
        Log.i(LSP_TAG, "手枪一次只能发射一颗子弹");
    }

    @Override
    public void shoot() {
        Log.i(LSP_TAG, "手枪开始射击");
    }

}
