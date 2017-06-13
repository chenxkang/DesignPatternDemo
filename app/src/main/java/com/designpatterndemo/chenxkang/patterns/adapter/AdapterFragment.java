package com.designpatterndemo.chenxkang.patterns.adapter;

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
 * time  : 17/4/18
 * desc  : 适配器模式
 *
 * 定义：将一个类的接口变换成客户端所期待的另一种接口，从而使得原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
 *
 */

public class AdapterFragment extends BaseFragment {

    public static final String ADAPTER_TAG = "ADAPTER_TAG";

    @BindView(R.id.pattern_tv)
    TextView patternTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_pattern_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patternTv.setText(R.string.ADAPTER);
        patternTv.setMovementMethod(LinkMovementMethod.getInstance());

        // 现有功能：播放mp3格式的文件
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.play("mp3","你在终点等我(王菲).mp3");

        // 新增功能：播放avi和mp4格式的文件
        AdvancedMediaPlayer advancedMediaPlayer = new AdvancedMediaPlayer();
        advancedMediaPlayer.playAVI("忠犬八公.avi");
        advancedMediaPlayer.playMP4("火影忍者.mp4");

        // 合并功能：播放mp3、avi和mp4格式的文件
        UniversalMediaPlayer universalMediaPlayer = new UniversalMediaPlayer();
        universalMediaPlayer.play("mp3","你在终点等我(王菲).mp3");
        universalMediaPlayer.play("avi","忠犬八公.avi");
        universalMediaPlayer.play("mp4","火影忍者.mp4");
        universalMediaPlayer.play("rmvb","激情与速度8.rmvb");

    }
}
