package com.designpatterndemo.chenxkang.principles.LSP;

/**
 * author: xiaokang
 * time  : 17/3/30
 * desc  : 枪支抽象类
 */

public abstract class BaseGun {

    //  枪支的特点
    public abstract void gunZoom();

    // 枪支射击的特点
    public abstract void characteristic();

    // 枪支射击的方法
    public abstract void shoot();

}
