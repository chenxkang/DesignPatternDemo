package com.designpatterndemo.chenxkang.patterns.visitor;

/**
 * author: chenxkang
 * time  : 17/5/5
 * desc  :
 */

public abstract class Department {

    // 声明一组重载的访问方法，用于访问不同类型的具体元素
    abstract void visit(FulltimeEmployee employee);
    abstract void visit(ParttimeEmployee employee);

}
