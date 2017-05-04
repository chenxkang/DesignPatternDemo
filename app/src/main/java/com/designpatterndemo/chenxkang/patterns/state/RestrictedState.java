package com.designpatterndemo.chenxkang.patterns.state;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.state.StateFragment.STATE_TAG;

/**
 * author: chenxkang
 * time  : 17/5/4
 * desc  : 受限状态
 */

public class RestrictedState extends AccountState {

    public RestrictedState(AccountState state) {
        this.acc = state.acc;
    }

    @Override
    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        Log.i(STATE_TAG, "账号受限，取款失败！");
    }

    @Override
    public void computeInterest() {
        Log.i(STATE_TAG, "计算利息！");
    }

    @Override
    public void stateCheck() {
        if (acc.getBalance() > 0){
            acc.setState(new NormalState(this));
        } else if (acc.getBalance() > -2000){
            acc.setState(new OverdraftState(this));
        }
    }
}
