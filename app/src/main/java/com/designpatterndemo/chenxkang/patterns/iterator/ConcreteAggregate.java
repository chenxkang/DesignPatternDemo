package com.designpatterndemo.chenxkang.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * author: chenxkang
 * time  : 17/4/28
 * desc  :
 */

public class ConcreteAggregate implements Aggregate {

    private List<Object> list = new ArrayList<>();

    @Override
    public void addObject(Object obj) {
        this.list.add(obj);
    }

    @Override
    public void removeObject(Object obj) {
        this.list.remove(obj);
    }

    @Override
    public void removeObject(int position) {
        this.list.remove(position);
    }

    @Override
    public List<Object> getList() {
        return list;
    }

    @Override
    public void setList(List<Object> list) {
        this.list = list;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(list);
    }

}
