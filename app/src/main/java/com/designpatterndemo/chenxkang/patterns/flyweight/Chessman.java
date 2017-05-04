package com.designpatterndemo.chenxkang.patterns.flyweight;

/**
 * author: chenxkang
 * time  : 17/4/25
 * desc  : 抽象享元类
 */

public abstract class Chessman {

    /**
     * 内部状态 棋子颜色
     *
     * @return
     */
    public abstract String getColor();

    /**
     * 设置外部状态 棋子位置
     *
     * @param coordinates 位置对象
     */
    public abstract void setPosition(Coordinates coordinates);

    /**
     * 获取外部状态 棋子位置
     *
     * @return
     */
    public abstract Coordinates getPosition();

}
