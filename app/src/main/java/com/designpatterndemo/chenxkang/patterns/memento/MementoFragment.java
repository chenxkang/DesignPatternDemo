package com.designpatterndemo.chenxkang.patterns.memento;

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
 * time  : 17/5/2
 * desc  : 备忘录模式
 */

public class MementoFragment extends BaseFragment {

    public static final String MEMENTO_TAG = "MEMENTO_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText(R.string.MEMENTO);
        patternTv.setMovementMethod(LinkMovementMethod.getInstance());

//        int data = 0;
//        Caretaker caretaker = new Caretaker();
//        Originator originator = new Originator(data++ + "");
//        Log.i(MEMENTO_TAG, "当前原发器状态为：" + originator.getState());
//
//        Log.i(MEMENTO_TAG, "--- 备忘录01 ---");
//        caretaker.setMemento(originator.saveMemento());
//        Log.i(MEMENTO_TAG, "备忘录数据为：" + caretaker.getMemento().toString());
//
//        Log.i(MEMENTO_TAG, "--- 原发器发生了改变 ---");
//        originator.setState(data++ + "");
//        Log.i(MEMENTO_TAG, "当前原发器状态为：" + originator.getState());
//
//        Log.i(MEMENTO_TAG, "--- 备忘录02 ---");
//        caretaker.setMemento(originator.saveMemento());
//        Log.i(MEMENTO_TAG, "备忘录数据为：" + caretaker.getMemento().toString());
//
//        Log.i(MEMENTO_TAG, "--- 原发器发生了改变 ---");
//        originator.setState(data++ + "");
//        Log.i(MEMENTO_TAG, "当前原发器状态为：" + originator.getState());
//
//        Log.i(MEMENTO_TAG, "--- 撤销操作 ---");
//        Log.i(MEMENTO_TAG, "当前备忘录数据为：" + caretaker.getMemento().toString());
//        originator.restoreMemento(caretaker.getMemento());
//        Log.i(MEMENTO_TAG, "撤销成功！原发器状态为：" + originator.getState());

        initData();

    }

    static int index = -1;
    static Caretaker caretaker = new Caretaker();
    private void initData() {
        Originator originator = new Originator("第1行，第3列");
        saveState(originator);
        Log.i(MEMENTO_TAG, "******************************");
        Log.i(MEMENTO_TAG, "--- 原发器发生了改变 ---");
        originator.setState("第2行，第5列");
        saveState(originator);
        Log.i(MEMENTO_TAG, "******************************");
        Log.i(MEMENTO_TAG, "--- 原发器发生了改变 ---");
        originator.setState("第3行，第7列");
        saveState(originator);
        Log.i(MEMENTO_TAG, "******************************");
        Log.i(MEMENTO_TAG, "--- 原发器发生了改变 ---");
        originator.setState("第4行，第9列");
        saveState(originator);
        Log.i(MEMENTO_TAG, "******************************");
        undoState(originator, index);
        Log.i(MEMENTO_TAG, "******************************");
        undoState(originator, index);
    }

    // 撤销操作
    private void undoState(Originator originator, int i) {
        Log.i(MEMENTO_TAG, "--- 撤销操作 ---");
        index--;
        // 撤销到上一个备忘录
        originator.restoreMemento(caretaker.getMemento(i-1));
        Log.i(MEMENTO_TAG, "撤销成功！原发器状态为：" + originator.getState());
    }

    // 保存操作
    private void saveState(Originator originator) {
        Log.i(MEMENTO_TAG, "原发器状态为：" + originator.getState());
        Log.i(MEMENTO_TAG, "--- 保存备忘录 ---");
        caretaker.setMemento(originator.saveMemento());
        index++;
        Log.i(MEMENTO_TAG, "当前备忘录数据为：" + caretaker.getMemento(index).toString());
    }

}
