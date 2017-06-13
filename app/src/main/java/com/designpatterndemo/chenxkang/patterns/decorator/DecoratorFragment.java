package com.designpatterndemo.chenxkang.patterns.decorator;

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
 * time  : 17/4/24
 * desc  : 装饰者模式
 *
 * 定义：动态地为一个对象添加一些额外的职责。
 */

public class DecoratorFragment extends BaseFragment {

    public static final String DECORATOR_TAG = "DECORATOR_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText(R.string.DECORATOR);
        patternTv.setMovementMethod(LinkMovementMethod.getInstance());

        // 白色花瓶，无任何装饰
        FlowerVase flowerVase = new FlowerVase();
        flowerVase.decorator();

        Log.i(DECORATOR_TAG, "－－－－－－－－－－－－－－－－－");

        // 白色花瓶，插入了几支红玫瑰
        FlowerVaseDecorator roseVase = new RoseFlowerVase(new FlowerVase());
        roseVase.decorator();

        Log.i(DECORATOR_TAG, "－－－－－－－－－－－－－－－－－");

        // 白色花瓶，插入了几支黄菊
        FlowerVaseDecorator anthemisVase = new AnthemisFlowerVase(new FlowerVase());
        anthemisVase.decorator();


    }
}
