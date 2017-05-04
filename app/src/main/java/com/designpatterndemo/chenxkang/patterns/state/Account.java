package com.designpatterndemo.chenxkang.patterns.state;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.state.StateFragment.STATE_TAG;

/**
 * author: chenxkang
 * time  : 17/5/4
 * desc  : 环境类
 */

public class Account {
    private AccountState state;// 持有一个抽象状态类的引用
    private String owner;// 名称
    private double balance = 0;// 余额

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.state = new NormalState(this);// 初始化状态

        Log.i(STATE_TAG, owner + "初始存款为: " + balance);
        Log.i(STATE_TAG, "-----------------------------");
    }

    public void deposit(double amount){
        Log.i(STATE_TAG, owner + "存款: " + amount);
        state.deposit(amount);
        Log.i(STATE_TAG, "现在的余额: " + balance);
        Log.i(STATE_TAG, "现在的账户状态: " + state.getClass().getSimpleName());
        Log.i(STATE_TAG, "-----------------------------");
    }

    public void withdraw(double amount){
        Log.i(STATE_TAG, owner + "取款: " + amount);
        state.withdraw(amount);
        Log.i(STATE_TAG, "现在的余额: " + balance);
        Log.i(STATE_TAG, "现在的账户状态: " + state.getClass().getSimpleName());
        Log.i(STATE_TAG, "-----------------------------");
    }

    public void computeInterest(){
        state.computeInterest();
    }

    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
