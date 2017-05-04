package com.designpatterndemo.chenxkang.principles.LSP;

import android.util.Log;

import static com.designpatterndemo.chenxkang.principles.LSP.LSPFragment.LSP_TAG;

/**
 * author: xiaokang
 * time  : 17/3/30
 * desc  : 机枪实现类
 */

public class CachineGun extends BaseGun {

    public void cachineGunName(){
        Log.i(LSP_TAG, "士兵使用的武器是机枪");
    }

    @Override
    public void gunZoom(){
        cachineGunName();
        Log.i(LSP_TAG, "机枪长，火力十分凶猛");
    }

    @Override
    public void characteristic() {
        Log.i(LSP_TAG, "机枪可以扫射");
    }

    @Override
    public void shoot() {
        Log.i(LSP_TAG, "机枪开始射击");
    }
}
