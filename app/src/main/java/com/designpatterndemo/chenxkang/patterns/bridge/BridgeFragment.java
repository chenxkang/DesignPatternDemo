package com.designpatterndemo.chenxkang.patterns.bridge;

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
 * time  : 17/4/19
 * desc  : 桥接模式
 *
 * 定义：将抽象和实现解耦，使两者可以独立变化。
 */

public class BridgeFragment extends BaseFragment {

    public static final String BRIDGE_TAG = "BRIDGE_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText(R.string.BRIDGE);
        patternTv.setMovementMethod(LinkMovementMethod.getInstance());

        ModelImp model;
        ColorImp color;
        PenAbstraction targetPen;

        // 中号红色蜡笔
        Log.i(BRIDGE_TAG, "中号红色蜡笔");

        model = new MiddleModel();
        color = new RedColor();
        targetPen = new Crayon(model, color);
        targetPen.startDraw();


        Log.i(BRIDGE_TAG, "------------------------------");

        // 大号黄色蜡笔
        Log.i(BRIDGE_TAG, "大号黄色蜡笔");

        model = new BigModel();
        color = new YellowColor();
        targetPen = new Crayon(model, color);
        targetPen.startDraw();

    }
}
