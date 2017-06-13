package com.designpatterndemo.chenxkang.patterns.factory_method;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.designpatterndemo.chenxkang.BaseFragment;
import com.designpatterndemo.chenxkang.R;
import com.designpatterndemo.chenxkang.patterns.simple_factory.Cat;
import com.designpatterndemo.chenxkang.patterns.simple_factory.Dog;

import butterknife.BindView;

/**
 * author: chenxkang
 * time  : 17/4/6
 * desc  : 工厂方法模式
 * 定义：定义了一个创建产品对象的工厂接口，将实际创建工作推迟到子类工厂当中。
 *
 */

public class FactoryMethodFragment extends BaseFragment {

    public static final String FMP_TAG = "FMP_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText(R.string.FMP);
        patternTv.setMovementMethod(LinkMovementMethod.getInstance());

        DogFactory dogFactory = new DogFactory();
        Dog dog = (Dog) dogFactory.getAnimal();
        dog.introduce();
        dog.eatFood();

        CatFactory catFactory = new CatFactory();
        Cat cat = (Cat) catFactory.getAnimal();
        cat.introduce();
        cat.eatFood();

    }
}
