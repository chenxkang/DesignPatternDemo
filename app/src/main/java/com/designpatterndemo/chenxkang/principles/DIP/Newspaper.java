package com.designpatterndemo.chenxkang.principles.DIP;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  :
 */

public class Newspaper implements IRead {

    @Override
    public String getReadContent() {
        return "这是一份牛逼的报纸，讲述了一个IT程序猿的励志经历。。。";
    }
}
