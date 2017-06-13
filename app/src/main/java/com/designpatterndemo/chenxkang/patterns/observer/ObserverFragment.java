package com.designpatterndemo.chenxkang.patterns.observer;

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
 * time  : 17/5/3
 * desc  : 观察者模式
 */

public class ObserverFragment extends BaseFragment {

    public static final String OBSERVER_TAG = "OBSERVER_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText(R.string.OBSERVER);
        patternTv.setMovementMethod(LinkMovementMethod.getInstance());

        Subject subject = new ConcreteSubject();
        Observer observer2 = new Power2Observer();
        Observer observer3 = new Power3Observer();
        Observer observer4 = new Power4Observer();

        subject.register(observer2);
        subject.register(observer3);
        subject.register(observer4);

        Log.i(OBSERVER_TAG, "--- 计算2的2次方、3次方和4次方 ---");
        Metadata metadata = new Metadata(2);
        subject.renew(metadata);

        Log.i(OBSERVER_TAG, "--- 计算3的2次方、3次方和4次方 ---");
        metadata.setData(3);
        subject.renew(metadata);

        Log.i(OBSERVER_TAG, "--- 计算4的2次方和4次方 ---");
        subject.unregister(observer3);
        metadata.setData(4);
        subject.renew(metadata);

    }
}
