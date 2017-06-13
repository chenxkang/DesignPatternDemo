package com.designpatterndemo.chenxkang.principles.OCP;

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
 * time  : 17/3/30
 * desc  : 开闭原则(Open Close Principle)
 *
 * 定义：一个软件实体(类、模块或函数)应当对扩展开放，对修改关闭。
 *      也就是说软件实体应尽量在不修改原有代码的情况下进行扩展。
 *
 * 问题：在软件的生命周期内，因为变化、升级和维护等原因需要对软件原有代码进行修改时，可能会给旧代码中引入错误，
 *      也可能会使我们不得不对整个功能进行重构，并且需要重新测试。
 *
 * 方案：当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
 *
 * 原则：
 *      1. 通过接口或抽象类约束扩展，对扩展进行边界限定；
 *      2. 参数类型、引用对象尽量使用接口或者抽象类，而不是实现类；
 *      3. 抽象层尽量保持稳定，一旦确定就不允许修改；
 *      4. 将相同的变化封装在一个接口或抽象类中；
 *      5. 将不同的变化封装到不同的接口或抽象类中。
 *
 * 总结：
 *      1. 单一职责原则要求实现类要职责单一；
 *      2. 里氏替换原则要求不要去破坏继承系统；
 *      3. 依赖倒置原则要求面向接口编程；
 *      4. 接口隔离原则要求在设计接口的时候要精简单一；
 *      5. 迪米特法则要求要降低耦合；
 *      6. 开闭原则是总纲，要求对扩展开发，对修改关闭。
 */

public class OCPFragment extends BaseFragment {

    public static final String OCP_TAG = "OCP_TAG";

    @BindView(R.id.principle_tv)
    TextView principleTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_principle_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        principleTv.setText(R.string.ocp);
        principleTv.setMovementMethod(LinkMovementMethod.getInstance());

        Manager manager = new Manager();
        manager.nameWorker(new Worker(), 666);
        manager.allocateTask(new Worker());
    }
}
