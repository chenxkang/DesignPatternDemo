package com.designpatterndemo.chenxkang.principles;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.designpatterndemo.chenxkang.BaseActivity;
import com.designpatterndemo.chenxkang.R;
import com.designpatterndemo.chenxkang.principles.DIP.DIPFragment;
import com.designpatterndemo.chenxkang.principles.ISP.ISPFragment;
import com.designpatterndemo.chenxkang.principles.LOD.LODFragment;
import com.designpatterndemo.chenxkang.principles.LSP.LSPFragment;
import com.designpatterndemo.chenxkang.principles.OCP.OCPFragment;
import com.designpatterndemo.chenxkang.principles.SRP.SRPFragment;
import com.designpatterndemo.chenxkang.utils.FragmentUtils;
import com.designpatterndemo.chenxkang.utils.StringUtils;
import com.designpatterndemo.chenxkang.utils.Title;

import static com.designpatterndemo.chenxkang.Constants.KEY_PRINCIPLE;
import static com.designpatterndemo.chenxkang.Constants.STR_PRINCIPLE_DIP;
import static com.designpatterndemo.chenxkang.Constants.STR_PRINCIPLE_ISP;
import static com.designpatterndemo.chenxkang.Constants.STR_PRINCIPLE_LOD;
import static com.designpatterndemo.chenxkang.Constants.STR_PRINCIPLE_LSP;
import static com.designpatterndemo.chenxkang.Constants.STR_PRINCIPLE_OCP;
import static com.designpatterndemo.chenxkang.Constants.STR_PRINCIPLE_SRP;

/**
 * author: chenxkang
 * time  : 17/3/29
 * desc  : 设计原则
 */

public class PrinciplesActivity extends BaseActivity {

    private String principle = "";// 原则

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_frame_layout;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Title.setBack(this);

        Bundle bundle = getIntent().getExtras();
        principle = bundle.getString(KEY_PRINCIPLE);

        if (StringUtils.isEmpty(principle))
            return;

        initView();
    }

    private void initView() {
        switch (principle){
            case STR_PRINCIPLE_SRP:// 单一职责原则
                Title.setTitle(this, "单一职责原则");
                FragmentUtils.switchFragment(getFragmentManager(), new SRPFragment());
                break;
            case STR_PRINCIPLE_LSP:// 里氏替换原则
                Title.setTitle(this, "里氏替换原则");
                FragmentUtils.switchFragment(getFragmentManager(), new LSPFragment());
                break;
            case STR_PRINCIPLE_DIP:// 依赖倒置原则
                Title.setTitle(this, "依赖倒置原则");
                FragmentUtils.switchFragment(getFragmentManager(), new DIPFragment());
                break;
            case STR_PRINCIPLE_ISP:// 接口隔离原则
                Title.setTitle(this, "接口隔离原则");
                FragmentUtils.switchFragment(getFragmentManager(), new ISPFragment());
                break;
            case STR_PRINCIPLE_LOD:// 迪米特法则
                Title.setTitle(this, "迪米特法则");
                FragmentUtils.switchFragment(getFragmentManager(), new LODFragment());
                break;
            case STR_PRINCIPLE_OCP:// 开闭原则
                Title.setTitle(this, "开闭原则");
                FragmentUtils.switchFragment(getFragmentManager(), new OCPFragment());
                break;
        }
    }
}
