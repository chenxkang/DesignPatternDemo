package com.designpatterndemo.chenxkang.patterns.visitor;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.visitor.VisitorFragment.VISITOR_TAG;

/**
 * author: chenxkang
 * time  : 17/5/5
 * desc  : 财务部
 */

public class FADepartment extends Department {

    @Override
    void visit(FulltimeEmployee employee) {
        Log.i(VISITOR_TAG, "全职员工 姓名：" + employee.getName()
                + "，工资：" + employee.getWage());
    }

    @Override
    void visit(ParttimeEmployee employee) {
        Log.i(VISITOR_TAG, "兼职员工 姓名：" + employee.getName()
                + "，工资：" + employee.getWage());
    }

}
