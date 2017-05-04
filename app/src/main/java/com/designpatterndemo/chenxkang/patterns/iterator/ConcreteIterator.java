package com.designpatterndemo.chenxkang.patterns.iterator;

import java.util.List;

/**
 * author: chenxkang
 * time  : 17/4/28
 * desc  :
 */

public class ConcreteIterator implements Iterator {

    // 定义一个迭代器游标
    private int cursor = 0;
    private List<Object> objects;

    public ConcreteIterator(List<Object> objects) {
        this.objects = objects;
    }

    @Override
    public void first() {
        cursor = 0;
    }

    @Override
    public void next() {
        if (cursor < objects.size())
            cursor++;
    }

    @Override
    public void last() {
        cursor = objects.size() - 1;
    }

    @Override
    public boolean hasNext() {
        if (cursor < objects.size())
            return true;

        return false;
    }

    @Override
    public boolean isFirst() {
        return cursor == 0 ? true : false;
    }

    @Override
    public boolean isLast() {
        return cursor == (objects.size() - 1) ? true : false;
    }

    @Override
    public Object getCurrentObject() {
        return objects.get(cursor);
    }
}
