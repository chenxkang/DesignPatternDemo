package com.designpatterndemo.chenxkang.patterns.bridge;

/**
 * author: chenxkang
 * time  : 17/4/19
 * desc  : 类型抽象类
 */

public interface ModelImp {

    /**
     * 相关业务逻辑
     */
    void drawModel();

    /**
     * 获得类型
     *
     * @return 类型
     */
    String getModel();

}
