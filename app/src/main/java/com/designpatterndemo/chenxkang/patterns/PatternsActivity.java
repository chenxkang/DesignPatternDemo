package com.designpatterndemo.chenxkang.patterns;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.designpatterndemo.chenxkang.BaseActivity;
import com.designpatterndemo.chenxkang.R;
import com.designpatterndemo.chenxkang.patterns.abstract_factory.AbstractFactoryFragment;
import com.designpatterndemo.chenxkang.patterns.adapter.AdapterFragment;
import com.designpatterndemo.chenxkang.patterns.bridge.BridgeFragment;
import com.designpatterndemo.chenxkang.patterns.builder.BuilderFragment;
import com.designpatterndemo.chenxkang.patterns.chain_of_responsibility.ResponChainFragment;
import com.designpatterndemo.chenxkang.patterns.command.CommandFragment;
import com.designpatterndemo.chenxkang.patterns.composite.CompositeFragment;
import com.designpatterndemo.chenxkang.patterns.decorator.DecoratorFragment;
import com.designpatterndemo.chenxkang.patterns.facade.FacadeFragment;
import com.designpatterndemo.chenxkang.patterns.factory_method.FactoryMethodFragment;
import com.designpatterndemo.chenxkang.patterns.flyweight.FlyweightFragment;
import com.designpatterndemo.chenxkang.patterns.iterator.IteratorFragment;
import com.designpatterndemo.chenxkang.patterns.mediator.MediatorFragment;
import com.designpatterndemo.chenxkang.patterns.memento.MementoFragment;
import com.designpatterndemo.chenxkang.patterns.observer.ObserverFragment;
import com.designpatterndemo.chenxkang.patterns.prototype.PrototypeFragment;
import com.designpatterndemo.chenxkang.patterns.proxy.ProxyFragment;
import com.designpatterndemo.chenxkang.patterns.simple_factory.SimpleFactoryFragment;
import com.designpatterndemo.chenxkang.patterns.singleton.SingletonFragment;
import com.designpatterndemo.chenxkang.patterns.state.StateFragment;
import com.designpatterndemo.chenxkang.patterns.strategy.StrategyFragment;
import com.designpatterndemo.chenxkang.patterns.visitor.VisitorFragment;
import com.designpatterndemo.chenxkang.utils.FragmentUtils;
import com.designpatterndemo.chenxkang.utils.StringUtils;
import com.designpatterndemo.chenxkang.utils.Title;

import static com.designpatterndemo.chenxkang.Constants.KEY_PATTERN;
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

/**
 * author: chenxkang
 * time  : 17/3/29
 * desc  : 设计模式
 */

public class PatternsActivity extends BaseActivity {

    private String pattern = "";// 模式

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_frame_layout;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Title.setBack(this);

        Bundle bundle = getIntent().getExtras();
        pattern = bundle.getString(KEY_PATTERN);

        if (StringUtils.isEmpty(pattern))
            return;

        initView();

    }

    private void initView() {
        switch (pattern){
            case STR_PATTERN_SIMPLE_FACTORY:// 简单工厂模式
                Title.setTitle(this, "简单工厂模式");
                FragmentUtils.switchFragment(getFragmentManager(), new SimpleFactoryFragment());
                break;
            case STR_PATTERN_FACTORY_METHOD:// 工厂方法模式
                Title.setTitle(this, "工厂方法模式");
                FragmentUtils.switchFragment(getFragmentManager(), new FactoryMethodFragment());
                break;
            case STR_PATTERN_ABSTRACT_FACTORY:// 抽象工厂模式
                Title.setTitle(this, "抽象工厂模式");
                FragmentUtils.switchFragment(getFragmentManager(), new AbstractFactoryFragment());
                break;
            case STR_PATTERN_SINGLETON:// 单例模式
                Title.setTitle(this, "单例模式");
                FragmentUtils.switchFragment(getFragmentManager(), new SingletonFragment());
                break;
            case STR_PATTERN_PROTOTYPE:// 原型模式
                Title.setTitle(this, "原型模式");
                FragmentUtils.switchFragment(getFragmentManager(), new PrototypeFragment());
                break;
            case STR_PATTERN_BUILDER:// 建造者模式
                Title.setTitle(this, "建造者模式");
                FragmentUtils.switchFragment(getFragmentManager(), new BuilderFragment());
                break;
            case STR_PATTERN_ADAPTER:// 适配器模式
                Title.setTitle(this, "适配器模式");
                FragmentUtils.switchFragment(getFragmentManager(), new AdapterFragment());
                break;
            case STR_PATTERN_BRIDGE:// 桥接模式
                Title.setTitle(this, "桥接模式");
                FragmentUtils.switchFragment(getFragmentManager(), new BridgeFragment());
                break;
            case STR_PATTERN_COMPOSITE:// 组合模式
                Title.setTitle(this, "组合模式");
                FragmentUtils.switchFragment(getFragmentManager(), new CompositeFragment());
                break;
            case STR_PATTERN_DECORATOR:// 装饰模式
                Title.setTitle(this, "装饰模式");
                FragmentUtils.switchFragment(getFragmentManager(), new DecoratorFragment());
                break;
            case STR_PATTERN_FACADE:// 外观模式
                Title.setTitle(this, "外观模式");
                FragmentUtils.switchFragment(getFragmentManager(), new FacadeFragment());
                break;
            case STR_PATTERN_FLYWEIGHT:// 享元模式
                Title.setTitle(this, "享元模式");
                FragmentUtils.switchFragment(getFragmentManager(), new FlyweightFragment());
                break;
            case STR_PATTERN_PROXY:// 代理模式
                Title.setTitle(this, "代理模式");
                FragmentUtils.switchFragment(getFragmentManager(), new ProxyFragment());
                break;
            case STR_PATTERN_CHAIN_OF_RESPONSIBILITY:// 责任链模式
                Title.setTitle(this, "责任链模式");
                FragmentUtils.switchFragment(getFragmentManager(), new ResponChainFragment());
                break;
            case STR_PATTERN_COMMAND:// 命令模式
                Title.setTitle(this, "命令模式");
                FragmentUtils.switchFragment(getFragmentManager(), new CommandFragment());
                break;
            case STR_PATTERN_ITERATOR:// 迭代器模式
                Title.setTitle(this, "迭代器模式");
                FragmentUtils.switchFragment(getFragmentManager(), new IteratorFragment());
                break;
            case STR_PATTERN_MEDIATOR:// 中介者模式
                Title.setTitle(this, "中介者模式");
                FragmentUtils.switchFragment(getFragmentManager(), new MediatorFragment());
                break;
            case STR_PATTERN_MEMENTO:// 备忘录模式
                Title.setTitle(this, "备忘录模式");
                FragmentUtils.switchFragment(getFragmentManager(), new MementoFragment());
                break;
            case STR_PATTERN_OBSERVER:// 观察者模式
                Title.setTitle(this, "观察者模式");
                FragmentUtils.switchFragment(getFragmentManager(), new ObserverFragment());
                break;
            case STR_PATTERN_STATE:// 状态模式
                Title.setTitle(this, "状态模式");
                FragmentUtils.switchFragment(getFragmentManager(), new StateFragment());
                break;
            case STR_PATTERN_STRATEGY:// 策略模式
                Title.setTitle(this, "策略模式");
                FragmentUtils.switchFragment(getFragmentManager(), new StrategyFragment());
                break;
            case STR_PATTERN_VISITOR:// 访问者模式
                Title.setTitle(this, "访问者模式");
                FragmentUtils.switchFragment(getFragmentManager(), new VisitorFragment());
                break;
        }
    }
}
