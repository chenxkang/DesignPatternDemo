package com.designpatterndemo.chenxkang.patterns.visitor;

/**
 * author: chenxkang
 * time  : 17/5/5
 * desc  : 抽象员工类
 */

public interface Employee {

    // 接受一个抽象访问者访问
    void accept(Department department);

}
