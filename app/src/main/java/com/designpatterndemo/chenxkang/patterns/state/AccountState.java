package com.designpatterndemo.chenxkang.patterns.state;

/**
 * author: chenxkang
 * time  : 17/5/4
 * desc  : 抽象状态类
 */

public abstract class AccountState {

    protected Account acc;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();

}
