package com.designpatterndemo.chenxkang.patterns.prototype;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.designpatterndemo.chenxkang.BaseFragment;
import com.designpatterndemo.chenxkang.R;

import java.io.IOException;

import butterknife.BindView;

/**
 * author: chenxkang
 * time  : 17/4/6
 * desc  : 原型模式
 * 定义：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 */

public class PrototypeFragment extends BaseFragment {

    public static final String PROTOTYPE_TAG = "PROTOTYPE_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText(R.string.PROTOTYPE);
        patternTv.setMovementMethod(LinkMovementMethod.getInstance());

        // －－－－－－－－－－浅克隆－－－－－－－－－－－－

        Log.i(PROTOTYPE_TAG, "－－－－－－－－－－浅克隆－－－－－－－－－－－－");

        Log.i(PROTOTYPE_TAG, "浅克隆前＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
        Address monkey_address = new Address("花果山");
        MonkeyPrototype monkey = new MonkeyPrototype("孙悟空","六耳猕猴", monkey_address);
        Log.i(PROTOTYPE_TAG, "原型猴儿 => " + monkey);
        Log.i(PROTOTYPE_TAG, monkey.getName() + "，" + monkey.getCategory() + "，" + monkey.getAddress().getAddress());

        // 克隆一只猴A
        MonkeyPrototype monkey_A = null;
        try {
            monkey_A = (MonkeyPrototype) monkey.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        monkey_A.setName("猴儿A");// 改变原有的name值
        monkey_A.getAddress().setAddress("峨眉山");// 改变原有的地址

        Log.i(PROTOTYPE_TAG, "浅克隆后＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");

        Log.i(PROTOTYPE_TAG, "原型猴儿 => " + monkey);
        Log.i(PROTOTYPE_TAG, monkey.getName() + "，" + monkey.getCategory() + "，" + monkey.getAddress().getAddress());
        Log.i(PROTOTYPE_TAG, "原型猴儿-->猴儿A => " + monkey_A);
        Log.i(PROTOTYPE_TAG, monkey_A.getName() + "，" + monkey_A.getCategory() + "，" + monkey_A.getAddress().getAddress());

        Log.i(PROTOTYPE_TAG, "－－－－－－－－－－－－－－－－－－－－－－－－－－－－");

        Log.i(PROTOTYPE_TAG, "－－－－－－－－－－－－－－－－－－－－－－－－－－－－");

        // 对原型猴儿进行深克隆
        Log.i(PROTOTYPE_TAG, "－－－－－－－－－－深克隆－－－－－－－－－－－－");
        Log.i(PROTOTYPE_TAG, "深克隆前＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");

        Log.i(PROTOTYPE_TAG, "原型猴儿 => " + monkey);
        Log.i(PROTOTYPE_TAG, monkey.getName() + "，" + monkey.getCategory() + "，" + monkey.getAddress().getAddress());

        Log.i(PROTOTYPE_TAG, "深克隆后＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
        MonkeyPrototype monkey_B = null;

        try {
            monkey_B = (MonkeyPrototype) monkey.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        monkey_B.setName("猴儿B");
        monkey_B.getAddress().setAddress("黄山");

        Log.i(PROTOTYPE_TAG, "原型猴儿 => " + monkey);
        Log.i(PROTOTYPE_TAG, monkey.getName() + "，" + monkey.getCategory() + "，" + monkey.getAddress().getAddress());
        Log.i(PROTOTYPE_TAG, "原型猴儿-->猴儿B => " + monkey_B);
        Log.i(PROTOTYPE_TAG, monkey_B.getName() + "，" + monkey_B.getCategory() + "，" + monkey_B.getAddress().getAddress());

    }
}
