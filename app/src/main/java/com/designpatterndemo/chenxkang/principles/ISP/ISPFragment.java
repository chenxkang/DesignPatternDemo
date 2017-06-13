package com.designpatterndemo.chenxkang.principles.ISP;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.designpatterndemo.chenxkang.BaseFragment;
import com.designpatterndemo.chenxkang.R;

import butterknife.BindView;

/**
 * author: chenxkang
 * time  : 17/3/30
 * desc  : 接口隔离原则(Interface Segregation Principle)
 *
 * 定义：使用多个专门的接口，而不是使用庞大臃肿的单一接口，接口尽量细化，接口中的方法尽量少。
 *
 * 问题：类A通过接口I依赖类B，类C通过接口I依赖类D，如果接口I对于类A和类B来说不是最小接口，则类B和类D必须
 *      去实现他们不需要的方法。
 *
 * 解决：将臃肿的接口I拆分为独立的几个接口，类A和类C分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则。
 *
 * 原则：为各个类建立专用接口，而不要试图去建立一个很庞大的接口供所有依赖它的类去调用，因为这样会出现有些类并不需要
 *      去实现的方法。接口是设计时对外部设定的“契约”，通过分散定义多个接口，可以预防外来变更的扩散，提高系统的灵活
 *      性和可维护性。
 *
 * 注意：
 *      1. 接口尽量小，但是要有限度。如果接口过于小，则会造成接口数量过多的问题，使设计复杂化；接口也不能太大，
 *         那就违背了接口隔离原则。所以一定要适度。
 *      2. 只有专注地为一个类提供定制服务，才能建立最小的依赖关系；
 *      3. 提高内聚，减少对外交互。使接口用最少的方法去完成更多的事情。
 *
 */

public class ISPFragment extends BaseFragment {

    public static final String ISP_TAG = "ISP_TAG";

    @BindView(R.id.principle_tv)
    TextView principleTv;

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_principle_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        principleTv.setText(R.string.isp);
        principleTv.setMovementMethod(LinkMovementMethod.getInstance());

        // 富人使用手机 发送短信、拨打电话、听音乐和看视频
        Log.i(ISP_TAG, "富人 使用手机 发送短信、拨打电话、听音乐和看视频");
        WealthMan wealthMan = new WealthMan();
        wealthMan.sendMsg(new Mobile());
        wealthMan.call(new Mobile());
        wealthMan.music(new Mobile());
        wealthMan.video(new Mobile());

        // 穷人使用座机 有线、拨打电话
        Log.i(ISP_TAG, "穷人 使用座机 有线、拨打电话");
        PoorMan poorMan = new PoorMan();
        poorMan.isWired(new Phone());
        poorMan.call(new Phone());

        // 优化后
        Log.i(ISP_TAG, "优化后-----");
        Log.i(ISP_TAG, "富人1 使用手机 发送短信、拨打电话、听音乐和看视频");
        WealthMan1 wealthMan1 = new WealthMan1();
        wealthMan1.sendMsg(new Mobile1());
        wealthMan1.call(new Mobile1());
        wealthMan1.music(new Mobile1());
        wealthMan1.video(new Mobile1());

        Log.i(ISP_TAG, "穷人1 使用座机 有线、拨打电话");
        PoorMan1 poorMan1 = new PoorMan1();
        poorMan1.isWired(new Phone1());
        poorMan1.call(new Phone1());
    }
}
