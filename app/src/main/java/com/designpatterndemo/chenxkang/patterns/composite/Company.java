package com.designpatterndemo.chenxkang.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * author: chenxkang
 * time  : 17/4/24
 * desc  :
 */

public abstract class Company {

    private String name;

    public List<Company> subCompanies;

    public Company(String name) {
        this.name = name;
        this.subCompanies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void addCompanies(List<Company> companies);

    public abstract void removeCompanies(List<Company> companies);

}
