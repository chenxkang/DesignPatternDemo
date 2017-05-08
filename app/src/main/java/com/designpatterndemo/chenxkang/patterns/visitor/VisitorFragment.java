package com.designpatterndemo.chenxkang.patterns.visitor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.designpatterndemo.chenxkang.BaseFragment;
import com.designpatterndemo.chenxkang.R;

import butterknife.BindView;

/**
 * author: chenxkang
 * time  : 17/5/4
 * desc  : 访问者模式
 */

public class VisitorFragment extends BaseFragment {

    public static final String VISITOR_TAG = "VISITOR_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText("访问者模式");

        EmployeeList employees = new EmployeeList();
        employees.addEmployee(new FulltimeEmployee("张小明", 10000));
        employees.addEmployee(new ParttimeEmployee("李小红", 4000));
        employees.addEmployee(new FulltimeEmployee("王思", 6000));
        employees.addEmployee(new ParttimeEmployee("二狗子", 7000));
        employees.addEmployee(new FulltimeEmployee("陈奕", 8000));
        employees.addEmployee(new ParttimeEmployee("赵云", 5000));
        employees.addEmployee(new FulltimeEmployee("钱三顺", 7500));
        employees.addEmployee(new ParttimeEmployee("孙公策", 9600));

        Department department;

        department = new HRDepartment();
        employees.accept(department);

    }

}
