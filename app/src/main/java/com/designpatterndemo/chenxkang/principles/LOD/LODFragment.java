package com.designpatterndemo.chenxkang.principles.LOD;

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
 * desc  : 迪米特法则(Law of Demeter)，亦最少知识原则(Least Knowledge Principle)
 *
 * 定义：一个对象应当对其他对象保持最少的了解。
 *
 * 问题：类与类之间的关系越密切，耦合度就越大，当其中一个类发生改变时，就会影响到另一个类的使用
 *
 * 方案：尽量降低类与类之间的耦合。
 *
 * 原则：高内聚，低耦合。
 *
 * 注意：可以直接相互作用的包括
 *       1. 当前对象本身，this；
 *       2. 以参数形式传入到当前对象方法中的对象；
 *       3. 当前对象的成员对象；
 *       4. 如果当前对象的成员对象是一个集合，那么集合中的元素也可以直接访问；
 *       5. 当前对象创建的对象。
 *       如果其他对象有相互耦合的情况，尽量采用第三者来降低耦合。
 *
 * 优点：有利于软件功能的扩展和维护
 * 缺点：不宜过分使用迪米特法则，不然会产生大量的中介和传递类，导致系统复杂度变大。所以在采用迪米特法则时要反复权衡，
 *      既要做到结构清晰，又要做到高内聚低耦合。
 *
 */

public class LODFragment extends BaseFragment {

    public static final String LOD_TAG = "LOD_TAG";

    @BindView(R.id.principle_tv)
    TextView principleTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_principle_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        principleTv.setText("迪米特法则");

        // 优化前 打印所有成员ID
        CompanyManager companyManager = new CompanyManager();
        companyManager.printAllEmployees(new SubCompanyManager());

        // 优化前 打印所有成员ID
        companyManager.printAllEmployees1(new SubCompanyManager());
    }
}
