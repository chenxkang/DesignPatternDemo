package com.designpatterndemo.chenxkang.patterns.strategy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.designpatterndemo.chenxkang.BaseFragment;
import com.designpatterndemo.chenxkang.R;

import butterknife.BindView;

/**
 * author: chenxkang
 * time  : 17/5/4
 * desc  : 策略模式
 */

public class StrategyFragment extends BaseFragment {

    public static final String STRATEGY_TAG = "STRATEGY_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText("策略模式");

        MovieTicket ticket = new MovieTicket();
        double originalPrice = 60.0;

        ticket.setPrice(originalPrice);
        Log.i(STRATEGY_TAG, "电影票原价：" + originalPrice);
        Log.i(STRATEGY_TAG, "--------------------------");

        // 团购价
        ticket.setDiscount(new TeamDiscount());
        Log.i(STRATEGY_TAG, "折后价：" + ticket.getPrice());
        Log.i(STRATEGY_TAG, "--------------------------");

        // 学生价
        ticket.setDiscount(new StudentDiscount());
        Log.i(STRATEGY_TAG, "折后价：" + ticket.getPrice());
        Log.i(STRATEGY_TAG, "--------------------------");

        // 儿童价
        ticket.setDiscount(new ChildrenDiscount());
        Log.i(STRATEGY_TAG, "折后价：" + ticket.getPrice());
        Log.i(STRATEGY_TAG, "--------------------------");

        // VIP价
        ticket.setDiscount(new VIPDiscount());
        Log.i(STRATEGY_TAG, "折后价：" + ticket.getPrice());
        Log.i(STRATEGY_TAG, "--------------------------");

    }

}
