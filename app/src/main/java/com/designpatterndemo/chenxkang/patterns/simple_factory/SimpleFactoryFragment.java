package com.designpatterndemo.chenxkang.patterns.simple_factory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.designpatterndemo.chenxkang.BaseFragment;
import com.designpatterndemo.chenxkang.R;

import butterknife.BindView;

/**
 * author: chenxkang
 * time  : 17/4/6
 * desc  : 简单工厂模式，又作静态工厂方法模式，属于创建型设计模式
 * 定义：通过专门定义一个工厂类来负责创建其它类的实例，而被创建的实例通常都拥有共同的父类或共同的接口。
 *
 */

public class SimpleFactoryFragment extends BaseFragment {

    public static final String SFP_TAG = "SFP_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText(R.string.SFP);
        patternTv.setMovementMethod(LinkMovementMethod.getInstance());

        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.getAnimal("dog");
        dog.introduce();
        dog.eatFood();

        Animal cat = factory.getAnimal("cat");
        cat.introduce();
        cat.eatFood();

    }
}
