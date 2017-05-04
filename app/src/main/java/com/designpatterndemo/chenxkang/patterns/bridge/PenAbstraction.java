package com.designpatterndemo.chenxkang.patterns.bridge;

/**
 * author: chenxkang
 * time  : 17/4/19
 * desc  :
 */

public abstract class PenAbstraction {

    // 定义对实例化类型角色的引用
    private ModelImp implModel;
    // 定义对实例化颜色角色的引用
    private ColorImp implColor;

    public PenAbstraction(ModelImp implModel, ColorImp implColor) {
        super();
        this.implModel = implModel;
        this.implColor = implColor;
    }

    // 定义一个介绍蜡笔类型和颜色的方法
    public void startDraw(){
        implModel.drawModel();
        implColor.drawColor();
    }

    // 获得实例化类型角色
    public ModelImp getImplModel(){
        return implModel;
    }

    // 获得实例化颜色角色
    public ColorImp getImplColor(){
        return implColor;
    }
}
