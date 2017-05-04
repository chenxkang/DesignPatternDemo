package com.designpatterndemo.chenxkang.principles.LSP;

import android.util.Log;

import static com.designpatterndemo.chenxkang.principles.LSP.LSPFragment.LSP_TAG;

/**
 * author: xiaokang
 * time  : 17/3/30
 * desc  : 步枪实现类
 */

public class RifleGun extends BaseGun {

    public void rifleGunName(){
        Log.i(LSP_TAG, "士兵使用的武器是步枪");
    }

    @Override
    public void gunZoom(){
        rifleGunName();
        Log.i(LSP_TAG, "步枪长，不益于携带");
    }

    @Override
    public void characteristic() {
        Log.i(LSP_TAG, "步枪可以连续射击");
    }

    @Override
    public void shoot() {
        Log.i(LSP_TAG, "步枪开始射击");
    }


}
