package com.designpatterndemo.chenxkang.utils;

import android.app.Activity;
import android.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.designpatterndemo.chenxkang.R;

/**
 * author: chenxkang
 * time  : 17/3/29
 * desc  : 标题工具类
 */

public class Title {

    public static void setTitle(Activity activity, String title){
        TextView textView = (TextView) activity.findViewById(R.id.title_name_tv);
        textView.setText(title);
    }

    public static void setBack(final Activity activity){
        ImageView imageView = (ImageView) activity.findViewById(R.id.title_back_iv);
        if (null != imageView){
            imageView.setVisibility(View.VISIBLE);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.finish();
                }
            });
        }
    }

    public static void setBack(final Fragment fragment){
        ImageView imageView = (ImageView) fragment.getActivity().findViewById(R.id.title_back_iv);
        if (null != imageView){
            imageView.setVisibility(View.VISIBLE);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fragment.getActivity().finish();
                }
            });
        }
    }
}
