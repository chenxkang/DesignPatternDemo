package com.designpatterndemo.chenxkang.patterns.visitor;

/**
 * author: chenxkang
 * time  : 17/5/5
 * desc  :
 */

public class FulltimeEmployee implements Employee {

    private String name;
    private double wage;

    public FulltimeEmployee(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    @Override
    public void accept(Department department) {
        department.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
