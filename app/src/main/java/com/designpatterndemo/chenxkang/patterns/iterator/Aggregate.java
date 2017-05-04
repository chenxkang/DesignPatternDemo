package com.designpatterndemo.chenxkang.patterns.iterator;

import java.util.List;

/**
 * author: chenxkang
 * time  : 17/4/28
 * desc  :
 */

public interface Aggregate {

    void addObject(Object obj);// 添加一个对象

    void removeObject(Object obj);// 移除一个对象

    void removeObject(int position);// 移除一个对象

    List<Object> getList();// 获取列表所有的数据

    void setList(List<Object> list);// 设置列表数据

    Iterator createIterator();// 获取迭代器实例

}
