package com.designpatterndemo.chenxkang.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * author: chenxkang
 * time  : 17/5/5
 * desc  : 员工列表
 */

public class EmployeeList {

    // 定义一个员工集合
    private List<Employee> employees = new ArrayList<>();

    // 添加员工
    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    // 遍历访问员工集合中的每一个员工对象
    public void accept(Department department){
        for (Employee emp : employees){
            emp.accept(department);
        }
    }

}
