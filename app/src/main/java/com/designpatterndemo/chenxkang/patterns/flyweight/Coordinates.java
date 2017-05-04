package com.designpatterndemo.chenxkang.patterns.flyweight;

/**
 * author: chenxkang
 * time  : 17/4/25
 * desc  : 外部状态类 棋子坐标
 */

public class Coordinates {

    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
