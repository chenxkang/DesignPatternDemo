package com.designpatterndemo.chenxkang.principles.DIP;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.designpatterndemo.chenxkang.BaseFragment;
import com.designpatterndemo.chenxkang.R;

import butterknife.BindView;

/**
 * author: chenxkang
 * time  : 17/3/30
 * desc  : 依赖倒置原则(Dependence Inversion Principle)
 *
 * 定义：高层模块不应该依赖低层模块，二者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象。
 *
 * 问题：类A直接依赖类B，假如要将类A改为依赖类C，则必须通过修改类A的代码来达成。这种场景下，类A一般是高层模块，
 *      负责复杂的业务逻辑；类B和类C是低层模块，负责基本的原子操作；假如修改类A，会给程序带来不必要的风险。
 *
 * 解决：将类A修改为依赖接口I，类B和类C各自实现接口I，类A通过接口I间接与类B或者类C发生联系，则会大大降低修改类A的几率。
 *
 * 原则：面向接口编程。抽象指的是接口或抽象类，细节就是具体的实现类，使用接口或者抽象类的目的是制定好规范和契约，
 *      而不去涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成。
 *
 * 注意：
 *      1. 在代码中传递参数或关联关系时，尽量引用高层的抽象层类，即使用接口和抽象类进行变量声明、参数类型声明、
 *         方法返回类型声明以及数据类型的转换；
 *      2. 当一个对象和其他对象有依赖关系时，可以利用依赖注入的方法将类之间进行解耦，主要有：构造注入、Set方法注入
 *         和接口注入；
 *      3. 开闭是原则，里氏是基础，依赖倒置是手段；
 *      4. 低层模块尽量都要有抽象类或接口，或者两者都有；
 *      5. 变量的声明类型尽量是抽象类或接口；
 *      6. 使用继承时遵循里氏替换原则。
 *
 * 好处：
 *      1. 可降低类之间的耦合性；
 *      2. 可提高系统的稳定性；
 *      3. 可降低修改程序所造成的风险。
 */

public class DIPFragment extends BaseFragment {

    public static final String DIP_TAG = "DIP_TAG";

    @BindView(R.id.principle_tv)
    TextView principleTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_principle_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        principleTv.setText("依赖倒置原则");

        Reader reader = new Reader();
        reader.read(new Book());
        reader.read(new Newspaper());
    }
}
