package com.designpatterndemo.chenxkang.patterns.builder;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import static com.designpatterndemo.chenxkang.patterns.builder.BuilderFragment.BUILDER_TAG;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  : 套餐创建结果
 */

public class Meal {
    private List<BaseFood> foods;// 用于记录套餐详情

    public Meal() {
        this.foods = new ArrayList<>();
    }

    /**
     * 添加套餐组成成分
     * @param food 套餐中组成部分的食物
     */
    public void addFood(BaseFood food){
        foods.add(food);
    }

    /**
     * 计算套餐总价
     * @return
     */
    public float getCost(){
        float cost = 0.0f;

        for (BaseFood food : foods){
            cost += food.foodPrice();
        }

        return cost;
    }

    /**
     * 展示套餐详情
     */
    public void showMeal(){
        for (BaseFood food : foods){
            Log.i(BUILDER_TAG, food.foodName() + "：" + food.foodPrice() + "元");
        }
    }
}
