package com.designpatterndemo.chenxkang.patterns.bridge;

/**
 * author: chenxkang
 * time  : 17/4/19
 * desc  : 颜色抽象类
 */

public interface ColorImp {

    /**
     * 相关业务逻辑
     */
    void drawColor();

    /**
     * 获得颜色
     *
     * @return 颜色
     */
    String getColor();

}
