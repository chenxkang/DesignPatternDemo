package com.designpatterndemo.chenxkang.patterns.proxy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.designpatterndemo.chenxkang.BaseFragment;
import com.designpatterndemo.chenxkang.R;

import java.lang.reflect.Proxy;

import butterknife.BindView;

/**
 * author: chenxkang
 * time  : 17/4/26
 * desc  : 代理模式
 */

public class ProxyFragment extends BaseFragment {

    public static final String PROXY_TAG = "PROXY_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText(R.string.PROXY);
        patternTv.setMovementMethod(LinkMovementMethod.getInstance());

        BuyTickets tickets;

        Log.i(PROXY_TAG, "--- 火车站购票 ---");
        tickets = new ProxyBuyTickets("train");
        tickets.request();

        Log.i(PROXY_TAG, "--- 代售点购票 ---");
        tickets = new ProxyBuyTickets("agency");
        tickets.request();

        Log.i(PROXY_TAG, "--- 动态代理 ---");
        DynamicProxy proxy = new DynamicProxy(tickets);
        ClassLoader loader = tickets.getClass().getClassLoader();
        BuyTickets tickets1 = (BuyTickets) Proxy.newProxyInstance(loader,new Class[]{BuyTickets.class}, proxy);
        tickets1.request();

        Log.i(PROXY_TAG, "--- 网络购票 ---");
        tickets = new ProxyBuyTickets("net");
        tickets.request();

    }
}
