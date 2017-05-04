package com.designpatterndemo.chenxkang.patterns.mediator;

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
 * time  : 17/4/28
 * desc  : 中介者模式
 */

public class MediatorFragment extends BaseFragment {

    public static final String MEDIATOR_TAG = "MEDIATOR_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText("中介者模式");

        Colleague colleague01;
        Colleague colleague02;
        Colleague colleague03;

        Log.i(MEDIATOR_TAG, "－－－ 同事01 通过 中介者01 与 同事02 进行通信 －－－");
        Mediator mediator01 = new ConcreteMediator01();
        colleague01 = new ConcreteColleague01(mediator01);
        colleague02 = new ConcreteColleague02(mediator01);
        mediator01.register(colleague02);
        colleague01.doTask("填写表格数据。。。");
        colleague01.sendTask(colleague02, "审核表格数据");

        Log.i(MEDIATOR_TAG, "－－－ 同事02 通过 中介者02 与 同事03 进行通信 －－－");
        Mediator mediator02 = new ConcreteMediator02();
        colleague02 = new ConcreteColleague02(mediator02);
        colleague03 = new ConcreteColleague03(mediator02);
        mediator02.register(colleague03);
        colleague02.sendTask(colleague03,"验收表格，签字确认");

        Log.i(MEDIATOR_TAG, "－－－ 同事01 通过 中介者01 与 其它同事 进行通信 －－－");
        Mediator mediator = new ConcreteMediator01();
        colleague01 = new ConcreteColleague01(mediator);
        colleague02 = new ConcreteColleague02(mediator);
        colleague03 = new ConcreteColleague03(mediator);
        mediator.register(colleague02);
        mediator.register(colleague03);
        colleague01.sendTaskToAll("准备开集体大会");

    }
}
