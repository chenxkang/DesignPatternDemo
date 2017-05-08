package com.designpatterndemo.chenxkang;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.designpatterndemo.chenxkang.patterns.PatternsActivity;
import com.designpatterndemo.chenxkang.principles.PrinciplesActivity;
import com.designpatterndemo.chenxkang.utils.IntentUtils;
import com.designpatterndemo.chenxkang.utils.Title;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static com.designpatterndemo.chenxkang.Constants.KEY_PATTERN;
import static com.designpatterndemo.chenxkang.Constants.KEY_PRINCIPLE;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_ABSTRACT_FACTORY;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_ADAPTER;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_BRIDGE;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_BUILDER;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_CHAIN_OF_RESPONSIBILITY;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_COMMAND;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_COMPOSITE;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_DECORATOR;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_FACADE;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_FACTORY_METHOD;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_FLYWEIGHT;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_ITERATOR;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_MEDIATOR;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_MEMENTO;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_OBSERVER;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_PROTOTYPE;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_PROXY;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_SIMPLE_FACTORY;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_SINGLETON;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_STATE;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_STRATEGY;
import static com.designpatterndemo.chenxkang.Constants.STR_PATTERN_VISITOR;
import static com.designpatterndemo.chenxkang.Constants.STR_PRINCIPLE_DIP;
import static com.designpatterndemo.chenxkang.Constants.STR_PRINCIPLE_ISP;
import static com.designpatterndemo.chenxkang.Constants.STR_PRINCIPLE_LOD;
import static com.designpatterndemo.chenxkang.Constants.STR_PRINCIPLE_LSP;
import static com.designpatterndemo.chenxkang.Constants.STR_PRINCIPLE_OCP;
import static com.designpatterndemo.chenxkang.Constants.STR_PRINCIPLE_SRP;

/**
 * author: chenxkang
 * time  : 17/3/29
 * desc  : 设计模式相关
 *
 */

public class MainActivity extends BaseActivity {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    private MainListAdapter listAdapter;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Title.setTitle(this, "设计原则与设计模式");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listAdapter = new MainListAdapter();
        listAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_RIGHT);
        recyclerView.addItemDecoration(new CutLineItemDecoration(this,1));
        recyclerView.setAdapter(listAdapter);

        initData();
        initListener();
    }

    private void initListener() {
        recyclerView.addOnItemTouchListener(new OnItemClickListener() {
            @Override
            public void onSimpleItemClick(BaseQuickAdapter adapter, View view, int position) {
                ItemEntity item = listAdapter.getItem(position);
                Bundle bundle = new Bundle();
                switch (item.getPattern()){
                    case "单一职责原则":
                        bundle.putString(KEY_PRINCIPLE, STR_PRINCIPLE_SRP);
                        IntentUtils.sendDataIntent(MainActivity.this,PrinciplesActivity.class,bundle);
                        break;
                    case "里氏替换原则":
                        bundle.putString(KEY_PRINCIPLE, STR_PRINCIPLE_LSP);
                        IntentUtils.sendDataIntent(MainActivity.this,PrinciplesActivity.class,bundle);
                        break;
                    case "依赖倒置原则":
                        bundle.putString(KEY_PRINCIPLE, STR_PRINCIPLE_DIP);
                        IntentUtils.sendDataIntent(MainActivity.this,PrinciplesActivity.class,bundle);
                        break;
                    case "接口隔离原则":
                        bundle.putString(KEY_PRINCIPLE, STR_PRINCIPLE_ISP);
                        IntentUtils.sendDataIntent(MainActivity.this,PrinciplesActivity.class,bundle);
                        break;
                    case "迪米特法则":
                        bundle.putString(KEY_PRINCIPLE, STR_PRINCIPLE_LOD);
                        IntentUtils.sendDataIntent(MainActivity.this,PrinciplesActivity.class,bundle);
                        break;
                    case "开闭原则":
                        bundle.putString(KEY_PRINCIPLE, STR_PRINCIPLE_OCP);
                        IntentUtils.sendDataIntent(MainActivity.this,PrinciplesActivity.class,bundle);
                        break;
                    case "简单工厂模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_SIMPLE_FACTORY);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "工厂方法模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_FACTORY_METHOD);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "抽象工厂模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_ABSTRACT_FACTORY);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "单例模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_SINGLETON);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "建造者模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_BUILDER);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "原型模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_PROTOTYPE);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "适配器模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_ADAPTER);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "装饰器模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_DECORATOR);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "代理模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_PROXY);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "外观模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_FACADE);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "桥接模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_BRIDGE);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "组合模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_COMPOSITE);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "享元模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_FLYWEIGHT);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "策略模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_STRATEGY);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "观察者模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_OBSERVER);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "迭代子模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_ITERATOR);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "责任链模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_CHAIN_OF_RESPONSIBILITY);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "命令模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_COMMAND);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "备忘录模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_MEMENTO);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "状态模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_STATE);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "访问者模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_VISITOR);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                    case "中介者模式":
                        bundle.putString(KEY_PATTERN, STR_PATTERN_MEDIATOR);
                        IntentUtils.sendDataIntent(MainActivity.this,PatternsActivity.class,bundle);
                        break;
                }
            }
        });
    }

    private void initData() {
        List<ItemEntity> datas = new ArrayList<>();

        datas.add(new ItemEntity("单一职责原则"));
        datas.add(new ItemEntity("里氏替换原则"));
        datas.add(new ItemEntity("依赖倒置原则"));
        datas.add(new ItemEntity("接口隔离原则"));
        datas.add(new ItemEntity("迪米特法则"));
        datas.add(new ItemEntity("开闭原则"));

        datas.add(new ItemEntity("简单工厂模式"));
        datas.add(new ItemEntity("工厂方法模式"));
        datas.add(new ItemEntity("抽象工厂模式"));
        datas.add(new ItemEntity("单例模式"));
        datas.add(new ItemEntity("建造者模式"));
        datas.add(new ItemEntity("原型模式"));
        datas.add(new ItemEntity("适配器模式"));
        datas.add(new ItemEntity("装饰器模式"));
        datas.add(new ItemEntity("代理模式"));
        datas.add(new ItemEntity("外观模式"));
        datas.add(new ItemEntity("桥接模式"));
        datas.add(new ItemEntity("组合模式"));
        datas.add(new ItemEntity("享元模式"));
        datas.add(new ItemEntity("策略模式"));
        datas.add(new ItemEntity("观察者模式"));
        datas.add(new ItemEntity("迭代子模式"));
        datas.add(new ItemEntity("责任链模式"));
        datas.add(new ItemEntity("命令模式"));
        datas.add(new ItemEntity("备忘录模式"));
        datas.add(new ItemEntity("状态模式"));
        datas.add(new ItemEntity("访问者模式"));
        datas.add(new ItemEntity("中介者模式"));

        listAdapter.addData(datas);
    }
}
