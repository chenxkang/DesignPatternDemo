package com.designpatterndemo.chenxkang.patterns.abstract_factory;

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
 * desc  : 抽象工厂模式
 * 定义：为创建一组相关或相互依赖的对象提供一个接口，而且无需指定它们的具体类。
 *
 */

public class AbstractFactoryFragment extends BaseFragment {

    public static final String AFP_TAG = "AFP_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText("抽象工厂模式");

        BlackAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
        blackAnimalFactory.keepDog();
        blackAnimalFactory.keepCat();

        WhiteAnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
        whiteAnimalFactory.keepDog();
        whiteAnimalFactory.keepCat();

    }
}
