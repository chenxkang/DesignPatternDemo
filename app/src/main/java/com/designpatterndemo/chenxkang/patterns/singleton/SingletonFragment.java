package com.designpatterndemo.chenxkang.patterns.singleton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.designpatterndemo.chenxkang.BaseFragment;
import com.designpatterndemo.chenxkang.R;

import butterknife.BindView;

/**
 * author: chenxkang
 * time  : 17/4/6
 * desc  : 单例模式
 * 定义：一个类有且仅有一个实例，并且自行实例化向整个系统提供。
 *
 */

public class SingletonFragment extends BaseFragment {

    public static final String SINGLETON_TAG = "SINGLETON_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText("单例模式");

        HungrySingleton.getInstance();
        IDHSingleton.getInstance();
        DCLSingleton.getInstance();

    }
}
