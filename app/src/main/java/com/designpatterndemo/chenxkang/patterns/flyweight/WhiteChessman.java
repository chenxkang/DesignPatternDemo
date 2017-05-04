package com.designpatterndemo.chenxkang.patterns.flyweight;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.flyweight.FlyweightFragment.FLYWEIGHT_TAG;

/**
 * author: chenxkang
 * time  : 17/4/25
 * desc  : 白色棋子
 */

public class WhiteChessman extends Chessman {

    private Coordinates coordinates;

    @Override
    public String getColor() {
        return "白色";
    }

    @Override
    public void setPosition(Coordinates coordinates) {
        this.coordinates = coordinates;
        Log.i(FLYWEIGHT_TAG, "棋子颜色：" + this.getColor()
                + "，棋子位置：" + coordinates.getX() + "，" + coordinates.getY());
    }

    @Override
    public Coordinates getPosition() {
        return coordinates;
    }
}
