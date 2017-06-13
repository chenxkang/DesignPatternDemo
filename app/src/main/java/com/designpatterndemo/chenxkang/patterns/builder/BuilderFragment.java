package com.designpatterndemo.chenxkang.patterns.builder;

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
 * time  : 17/4/6
 * desc  : 建造者模式
 *
 * 定义：将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示。
 *
 */

public class BuilderFragment extends BaseFragment {

    public static final String BUILDER_TAG = "BUILDER_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText(R.string.BUILDER);
        patternTv.setMovementMethod(LinkMovementMethod.getInstance());

        // 套餐A
        Log.i(BUILDER_TAG, "套餐A详情：");

        MealDirector mealDirector_A = new MealDirector();
        Meal meal_A = mealDirector_A.getMealA(new AMealBuilder());
        meal_A.showMeal();

        Log.i(BUILDER_TAG, "套餐A总价：" + meal_A.getCost() + "元。");

        Log.i(BUILDER_TAG, "－－－－－－－－－－－－－－－－－－－－－－");

        // 套餐B
        Log.i(BUILDER_TAG, "套餐B详情：");

        MealDirector mealDirector_B = new MealDirector();
        Meal meal_B = mealDirector_B.getMealB(new BMealBuilder());
        meal_B.showMeal();

        Log.i(BUILDER_TAG, "套餐B总价：" + meal_B.getCost() + "元。");


        Log.i(BUILDER_TAG, "－－－－－－－－－－－－－－－－－－－－－－");

        // 套餐C
        Log.i(BUILDER_TAG, "套餐C详情：");

        MealDirector mealDirector_C = new MealDirector();
        Meal meal_C = mealDirector_C.getMealC(new CMealBuilder());
        meal_C.showMeal();

        Log.i(BUILDER_TAG, "套餐C总价：" + meal_C.getCost() + "元。");

    }
}
