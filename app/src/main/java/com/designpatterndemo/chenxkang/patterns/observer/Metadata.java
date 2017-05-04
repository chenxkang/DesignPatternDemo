package com.designpatterndemo.chenxkang.patterns.observer;

/**
 * author: chenxkang
 * time  : 17/5/4
 * desc  : 数据源实体类
 */

public class Metadata {

    private int data;

    public Metadata(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
