package com.designpatterndemo.chenxkang.patterns.chain_of_responsibility;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.designpatterndemo.chenxkang.BaseFragment;
import com.designpatterndemo.chenxkang.R;

import butterknife.BindView;

/**
 * author: chenxkang
 * time  : 17/4/27
 * desc  : 责任链模式
 */

public class ResponChainFragment extends BaseFragment {

    public static final String RESP_CHAIN_TAG = "RESP_CHAIN_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText(R.string.COR);
        patternTv.setMovementMethod(LinkMovementMethod.getInstance());

        // 责任链：系统->组长->主管->总监->经理
        ChainHandler systemHandler = new SystemHandler();
        ChainHandler headmanHandler = new HeadmanHandler();
        ChainHandler chargeHandler = new ChargeHandler();
        ChainHandler chiefHandler = new ChiefHandler();
        ChainHandler managerHandler = new ManagerHandler();

        systemHandler.setNextHandler(headmanHandler);
        headmanHandler.setNextHandler(chargeHandler);
        chargeHandler.setNextHandler(chiefHandler);
        chiefHandler.setNextHandler(managerHandler);

        Log.i(RESP_CHAIN_TAG, "----- 自评分数：46分 -----");
        systemHandler.doHandler(46);

        Log.i(RESP_CHAIN_TAG, "----- 自评分数：78分 -----");
        systemHandler.doHandler(78);

        Log.i(RESP_CHAIN_TAG, "----- 自评分数：99分 -----");
        systemHandler.doHandler(99);

        Log.i(RESP_CHAIN_TAG, "----- 自评分数：122分 -----");
        systemHandler.doHandler(122);

        // 代理模式和责任链模式的结合
        Log.i(RESP_CHAIN_TAG, "----- 代理模式和责任链模式的结合 -----");
        Log.i(RESP_CHAIN_TAG, "----- 自评分数：88分 -----");
        ChainProxyHandler chainProxyHandler = new ChainProxyHandler();
        chainProxyHandler.doHandler(88);

    }
}
