package com.designpatterndemo.chenxkang.patterns.flyweight;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.designpatterndemo.chenxkang.BaseFragment;
import com.designpatterndemo.chenxkang.R;

import butterknife.BindView;

/**
 * author: chenxkang
 * time  : 17/4/25
 * desc  : 享元模式
 */

public class FlyweightFragment extends BaseFragment {

    public static final String FLYWEIGHT_TAG = "FLYWEIGHT_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText("享元模式");

        Chessman black01,black02,black03,white01,white02;
        ChessmanFactory factory = new ChessmanFactory();

        // 通过享元工厂获取三颗黑子
        black01 = factory.getChessman("b");
        black02 = factory.getChessman("b");
        black03 = factory.getChessman("b");

        // 通过享元工厂获取两颗白子
        white01 = factory.getChessman("w");
        white02 = factory.getChessman("w");

        Log.i(FLYWEIGHT_TAG, "判断前两颗黑子是否相同: " + (black01.equals(black02)));
        Log.i(FLYWEIGHT_TAG, "判断前两颗白子是否相同: " + (white01.equals(white02)));

        // 将棋子放到不同的位置
        black01.setPosition(new Coordinates(1,2));
        black02.setPosition(new Coordinates(3,4));
        black03.setPosition(new Coordinates(5,6));
        white01.setPosition(new Coordinates(7,8));
        white02.setPosition(new Coordinates(9,0));

        Log.i(FLYWEIGHT_TAG, "再次判断前两颗黑子是否相同: " + (black01.equals(black02)));
        Log.i(FLYWEIGHT_TAG, "再次判断前两颗白子是否相同: " + (white01.equals(white02)));

        Log.i(FLYWEIGHT_TAG, "第一颗白色棋子的位置为: "
                + white01.getPosition().getX() + "，" + white01.getPosition().getY());
        
        Log.i(FLYWEIGHT_TAG, "第二颗黑色棋子的位置为: "
                + black02.getPosition().getX() + "，" + black02.getPosition().getY());

    }
}
