package com.designpatterndemo.chenxkang.patterns.state;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.state.StateFragment.STATE_TAG;

/**
 * author: chenxkang
 * time  : 17/5/4
 * desc  : 透支状态
 */

public class OverdraftState extends AccountState {

    public OverdraftState(AccountState state) {
        this.acc = state.acc;
    }

    @Override
    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        acc.setBalance(acc.getBalance() - amount);
        stateCheck();
    }

    @Override
    public void computeInterest() {
        Log.i(STATE_TAG, "计算利息！");
    }

    @Override
    public void stateCheck() {
        if (acc.getBalance() > 0){
            acc.setState(new NormalState(this));
        } else if (acc.getBalance() == -2000){
            acc.setState(new RestrictedState(this));
        } else if (acc.getBalance() < -2000){
            Log.i(STATE_TAG, "操作受限！");
        }
    }
}
