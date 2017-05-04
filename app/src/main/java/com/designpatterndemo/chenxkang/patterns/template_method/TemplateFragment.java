package com.designpatterndemo.chenxkang.patterns.template_method;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.designpatterndemo.chenxkang.BaseFragment;
import com.designpatterndemo.chenxkang.R;

import butterknife.BindView;

/**
 * author: chenxkang
 * time  : 17/5/4
 * desc  : 模板方法模式
 */

public class TemplateFragment extends BaseFragment {

    public static final String TEMPLATE_TAG = "TEMPLATE_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText("模板方法模式");
    }

}
