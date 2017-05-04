package com.designpatterndemo.chenxkang.patterns.composite;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.designpatterndemo.chenxkang.BaseFragment;
import com.designpatterndemo.chenxkang.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * author: chenxkang
 * time  : 17/4/24
 * desc  : 组合模式
 *
 * 定义：将对象组合成树形结构以表示"部分－整体"的层次关系，使得用户对单个对象和组合对象的使用具有一致性。
 */

public class CompositeFragment extends BaseFragment {

    public static final String COMPOSITE_TAG = "COMPOSITE_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText("组合模式");

        // 总公司
        Company headOffice = new HeadOffice("北京总公司");

        // 浙江分公司和安徽分公司
        Company zjBranchOffice = new BranchOffice("浙江分公司");
        Company ahBranchOffice = new BranchOffice("安徽分公司");

        // 浙江杭州子公司、浙江宁波子公司、安徽合肥子公司、安徽安庆子公司
        Company hzSubOffice = new SubOffice("浙江杭州子公司");
        Company nbSubOffice = new SubOffice("浙江宁波子公司");
        Company hfSubOffice = new SubOffice("安徽合肥子公司");
        Company aqSubOffice = new SubOffice("安徽安庆子公司");

        // 组织架构
        zjBranchOffice.add(hzSubOffice);
        zjBranchOffice.add(nbSubOffice);

        ahBranchOffice.add(hfSubOffice);
        ahBranchOffice.add(aqSubOffice);

        List<Company> branchOffices = new ArrayList<>();
        branchOffices.add(zjBranchOffice);
        branchOffices.add(ahBranchOffice);
        headOffice.addCompanies(branchOffices);

        // 浙江分公司解散宁波分公司
        zjBranchOffice.remove(nbSubOffice);
        // 总公司解散安徽分公司
     // headOffice.remove(ahBranchOffice);
        // 总公司批量解散分公司
        headOffice.removeCompanies(branchOffices);

    }
}
