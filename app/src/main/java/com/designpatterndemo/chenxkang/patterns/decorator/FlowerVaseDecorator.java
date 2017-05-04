package com.designpatterndemo.chenxkang.patterns.decorator;

/**
 * author: chenxkang
 * time  : 17/4/24
 * desc  : 抽象装饰者类
 */

public abstract class FlowerVaseDecorator implements Vase {

    protected Vase vase;

    public FlowerVaseDecorator(Vase vase) {
        this.vase = vase;
    }

    @Override
    public void decorator() {
        vase.decorator();
    }

}
