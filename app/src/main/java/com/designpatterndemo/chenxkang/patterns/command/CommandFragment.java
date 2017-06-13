package com.designpatterndemo.chenxkang.patterns.command;

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
 * time  : 17/4/27
 * desc  : 命令模式
 */

public class CommandFragment extends BaseFragment {

    public static final String COMMAND_TAG = "COMMAND_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);

        patternTv.setText(R.string.COMMAND);
        patternTv.setMovementMethod(LinkMovementMethod.getInstance());

        TvReceiver receiver = new TvReceiver();
        ControllerInvoker invoker = new ControllerInvoker();

        Log.i(COMMAND_TAG, "--- 发出了一个开电视的命令 ---");
        Command turnOnCommand = new TurnOnCommand(receiver);
        invoker.setCommand(turnOnCommand);
        invoker.executeCommand("开电视");

        Log.i(COMMAND_TAG, "--- 发出了一个换频道的命令 ---");
        Command changeCommand = new ChangeCommand(receiver);
        invoker.setCommand(changeCommand);
        invoker.executeCommand("换频道");

        Log.i(COMMAND_TAG, "--- 发出了一个关电视的命令 ---");
        Command turnOffCommand = new TurnOffCommand(receiver);
        invoker.setCommand(turnOffCommand);
        invoker.executeCommand("关电视");

    }
}
