package com.designpatterndemo.chenxkang.patterns.iterator;

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
 * desc  : 迭代器模式
 */

public class IteratorFragment extends BaseFragment {

    public static final String ITERATOR_TAG = "ITERATOR_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText("迭代器模式");

        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.addObject(new Picture(0, "zero"));
        aggregate.addObject(new Picture(1, "one"));
        aggregate.addObject(new Picture(2, "two"));
        aggregate.addObject(new Picture(3, "three"));
        aggregate.addObject(new Picture(4, "four"));
        aggregate.addObject(new Picture(5, "five"));
        aggregate.addObject(new Picture(6, "six"));

        Iterator iterator = aggregate.createIterator();
        Picture picture = null;

        // 通过游标，查询所有对象
        Log.i(ITERATOR_TAG, "----- 第一次 查询所有对象 -----");
        while (iterator.hasNext()){
            picture = (Picture) iterator.getCurrentObject();
            Log.i(ITERATOR_TAG, "下标：" + picture.getPos() + "；名称：" + picture.getName());
            iterator.next();
        }

        Log.i(ITERATOR_TAG, "----- 查询出name为five的对象 -----");
        // 通过游标，查询出name为five的对象
        iterator.first();
        while (iterator.hasNext()){
            picture = (Picture) iterator.getCurrentObject();
            if (picture.getName().equals("five")){
                Log.i(ITERATOR_TAG, "查找成功！下标：" + picture.getPos()
                        + "；名称：" + picture.getName());
                iterator.last();
            }

            iterator.next();
        }

        Log.i(ITERATOR_TAG, "----- 移除下标为3的对象 第二次查询所有对象 -----");
        // 移除下标为3的对象，再次查询所有的对象
        iterator.first();
        aggregate.removeObject(3);
        while (iterator.hasNext()){
            picture = (Picture) iterator.getCurrentObject();
            Log.i(ITERATOR_TAG, "下标：" + picture.getPos() + "；名称：" + picture.getName());
            iterator.next();
        }
    }
}
