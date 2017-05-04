package com.designpatterndemo.chenxkang.patterns.composite;

import android.util.Log;

import java.util.List;

import static com.designpatterndemo.chenxkang.patterns.composite.CompositeFragment.COMPOSITE_TAG;

/**
 * author: chenxkang
 * time  : 17/4/24
 * desc  : 子公司
 */

public class SubOffice extends Company {

    public SubOffice(String name) {
        super(name);
        Log.i(COMPOSITE_TAG, "创建子公司：" + name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void addCompanies(List<Company> companies) {

    }

    @Override
    public void removeCompanies(List<Company> companies) {

    }
}
