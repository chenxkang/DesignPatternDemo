package com.designpatterndemo.chenxkang.patterns.facade;

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
 * desc  : 外观模式
 */

public class FacadeFragment extends BaseFragment {

    public static final String FACADE_TAG = "FACADE_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText("外观模式");

        Log.i(FACADE_TAG, "-------一般做法-------");

        // 毛笔写字
        Pen brush = new Brush();
        brush.draw();

        // 铅笔素描
        Pen pencil = new Pencil();
        pencil.draw();

        // 画笔绘图
        Pen paint = new Paint();
        paint.draw();

        Log.i(FACADE_TAG, "-------外观模式-------");

        // 使用外观类实现各种笔的功能
        PenFacade penFacade = new PenFacade();
        penFacade.brushDraw();
        penFacade.pencilDraw();
        penFacade.paintDraw();

    }
}
