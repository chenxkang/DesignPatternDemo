package com.designpatterndemo.chenxkang.patterns.composite;

import android.util.Log;

import java.util.List;

import static com.designpatterndemo.chenxkang.patterns.composite.CompositeFragment.COMPOSITE_TAG;

/**
 * author: chenxkang
 * time  : 17/4/24
 * desc  : 分公司
 */

public class BranchOffice extends Company {

    private String name;

    public BranchOffice(String name) {
        super(name);
        this.name = name;
        Log.i(COMPOSITE_TAG, "创建分公司：" + name);
    }

    @Override
    public void add(Company company) {
        subCompanies.add(company);
        Log.i(COMPOSITE_TAG, name + "新增了一个子公司：" + company.getName());
    }

    @Override
    public void remove(Company company) {
        subCompanies.remove(company);
        Log.i(COMPOSITE_TAG, name + "解除了一个分公司：" + company.getName());
    }

    @Override
    public void addCompanies(List<Company> companies) {
        subCompanies.addAll(companies);
        Log.i(COMPOSITE_TAG, name + "批量新增了" + companies.size() + "个子公司");
    }

    @Override
    public void removeCompanies(List<Company> companies) {
        subCompanies.removeAll(companies);
        Log.i(COMPOSITE_TAG, name + "批量解除了" + companies.size() + "个子公司");
    }
}
