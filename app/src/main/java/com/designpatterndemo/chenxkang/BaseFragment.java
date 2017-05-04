package com.designpatterndemo.chenxkang;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * author: xiaokang
 * time  : 17/3/29
 * desc  :
 */

public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(getLayoutResID(),container,false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    protected abstract @LayoutRes int getLayoutResID();

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
