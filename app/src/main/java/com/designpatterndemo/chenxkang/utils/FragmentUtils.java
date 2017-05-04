package com.designpatterndemo.chenxkang.utils;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.IdRes;

import com.designpatterndemo.chenxkang.R;

/**
 * author: chenxkang
 * time  : 17/3/29
 * desc  : Fragment相关
 */

public class FragmentUtils {

    public static Fragment switchFragment(FragmentManager fragmentManager, Fragment newFragment){
        return switchFragment(fragmentManager, R.id.container_frame,null,newFragment,null,false);
    }

    /**
     * 显示新的Fragment
     *
     * @param fragmentManager
     * @param container
     * @param currentFragment
     * @param newFragment
     * @param args
     * @param addToBackStack
     * @return
     */
    public static Fragment switchFragment(FragmentManager fragmentManager,
                                          @IdRes int container,
                                          Fragment currentFragment,
                                          Fragment newFragment,
                                          Bundle args,
                                          boolean addToBackStack){

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        String tag = newFragment.getClass().getSimpleName();
        Fragment fragment = fragmentManager.findFragmentByTag(tag);

        // 如果newFragment存在于栈中，则显示；否则重新生成
        if (fragment != null){
            if (fragment != currentFragment){
                if (currentFragment != null){
                    transaction.hide(currentFragment);
                }

                transaction.show(fragment);

                if (addToBackStack){
                    transaction.addToBackStack(null);
                }
                transaction.commitAllowingStateLoss();
            } else {
                fragment.getArguments().putAll(args);
            }

            return fragment;
        } else {
            try {
                fragment = newFragment.getClass().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        // 为新的Fragment添加参数
        if (fragment != null){
            if (args != null && !args.isEmpty()){
                Bundle bundle = fragment.getArguments();
                if (bundle != null){
                    bundle.putAll(args);
                } else {
                    fragment.setArguments(args);
                }
            }
        }

        // 显示新的Fragment
        if (currentFragment != null){
            transaction.hide(currentFragment);
        }

        transaction.add(container, fragment, tag);

        if (addToBackStack){
            transaction.addToBackStack(null);
        }

        transaction.commitAllowingStateLoss();
        return fragment;

    }
}
