package com.designpatterndemo.chenxkang.principles.DIP;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : 一本书
 */

public class Book implements IRead {

    @Override
    public String getReadContent() {
        return "这是一本旷世奇书，讲述了一个全真道人的故事。。。";
    }
}
