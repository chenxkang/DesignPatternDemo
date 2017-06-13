package com.designpatterndemo.chenxkang.principles.LSP;

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
 * desc  : 里氏替换原则(Liskov Substitution Principle)
 *
 * 定义：所有引用基类的地方必须能透明地使用其子类的对象。
 *
 * 问题：有一功能P1，由类A来完成。现在需要将功能P1进行扩展，扩展后的功能为P(P由原有功能P1和新功能P2组成)。
 *      功能P由类A的子类B来完成，子类B在完成新功能P2的同时有可能会导致原有功能P1发生故障。
 *
 * 解决：当使用继承时，遵循里氏替换原则。类B继承类A时，除添加新的方法完成新增功能P2外，尽量不要重写父类A的方法，
 *      也尽量不要重载父类A的方法。
 *
 * 原则：子类可以扩展父类的功能，但不能改变父类原有的功能。
 *      父类能出现的地方都可以用子类来代替，而且换成子类也不会出现任何错误或异常，而使用者也无需知道是父类还是子类，
 *      但反过来则不成立。总之，就是抽象。
 *
 *      1. 子类必须完全实现父类的抽象方法，但不能覆盖父类的非抽象方法；
 *      2. 子类中可以增加自己特有的方法；
 *      3. 当子类的方法重载父类的方法时，方法的前置条件(即方法的形参)要比父类方法的输入参数要更宽松；
 *      4.当子类的方法实现父类的抽象方法时，方法的后置条件(即方法的返回值)要比父类更严格。
 *
 * 优点：
 *      1. 提高代码的重用性，子类拥有父类的方法和属性；
 *      2. 提高代码的可扩展性，子类可形似于父类，但异于父类，保留自我的特性；
 *
 * 缺点：
 *      1. 继承是侵入性的，只要继承就必须拥有父类的所有方法和属性，在一定程度上约束了子类，降低了代码的灵活性；
 *      2. 增加了耦合，当父类的常量、变量或者方法被修改了，需要考虑子类的修改，所以一旦父类有了变动，很可能会造成
 *         非常糟糕的结果，要重构大量的代码。
 */

public class LSPFragment extends BaseFragment {

    public static final String LSP_TAG = "LSP_TAG";

    @BindView(R.id.principle_tv)
    TextView principleTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_principle_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        principleTv.setText(R.string.lsp);
        principleTv.setMovementMethod(LinkMovementMethod.getInstance());

        Soldier soldier = new Soldier();

        // 士兵使用手枪进行射击
        soldier.setGun(new HandGun());
        soldier.startShoot();

        // 士兵使用步枪进行射击
        soldier.setGun(new RifleGun());
        soldier.startShoot();

        // 士兵使用机枪进行射击
        soldier.setGun(new CachineGun());
        soldier.startShoot();
    }
}
