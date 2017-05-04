package com.designpatterndemo.chenxkang.patterns.iterator;

/**
 * author: chenxkang
 * time  : 17/4/28
 * desc  :
 */

public interface Iterator {

    void first();// 将游标指向第一个元素
    void next();// 将游标指向下一个元素
    void last();// 将游标指向最后一个元素
    boolean hasNext();// 判断是否有下一个元素

    boolean isFirst();// 判断是否是第一个元素
    boolean isLast();// 判断是否是最后一个元素

    Object getCurrentObject();// 获取当前对象

}
