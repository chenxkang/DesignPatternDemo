package com.designpatterndemo.chenxkang.principles.SRP;

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
 * time  : 17/3/29
 * desc  : 单一职责原则(Single Responsibility Principle)
 *
 * 定义：一个类只负责一项职责，应该只有一个能引起它变化的原因。
 *
 * 问题：类T负责两个不同的职责：职责P1，职责P2。当由于职责P1需求发生改变而需要修改类T时，有可能会导致原本运行正常
 *      的职责P2功能发生故障。
 *
 * 解决：分别建立两个类T1、T2，使T1完成职责P1功能，T2完成职责P2功能。这样，当修改类T1时，不会使职责P2发生故障风险；
 *      同理，当修改T2时，也不会使职责P1发生故障风险。
 *
 * 原则：如果一个类承担的职责越多，那么它被复用的可能性就越小，并且一个类承担的职责过多的话，这些职责就会耦合在一起，
 *      当其中一个职责发生改变时，就可能会影响到其他职责的运作，这样的话势必会影响到后期功能的优化或扩展。
 *      将这些职责进行适当地分离，将不同的职责封装到不同的类中，注意的是对于那些总是同时发生改变的多个职责，可将
 *      它们封装在同一类中。
 *
 * 优点：高内聚，低耦合。可降低类的复杂度，提高类的可读性，提高系统的可维护性，在一定程度上降低变更引起的风险。
 */

public class SRPFragment extends BaseFragment{

    public static final String SRP_TAG = "SRP_TAG";

    @BindView(R.id.principle_tv)
    TextView principleTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_principle_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        principleTv.setText(R.string.srp);
        principleTv.setMovementMethod(LinkMovementMethod.getInstance());

        Recommend recommend = new Recommend();
        recommend.rede("牛");
        recommend.rede("羊");
        recommend.rede("猪");
        recommend.rede1("鱼");
    }
}
