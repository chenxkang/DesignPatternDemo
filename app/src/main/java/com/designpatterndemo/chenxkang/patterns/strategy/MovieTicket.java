package com.designpatterndemo.chenxkang.patterns.strategy;

/**
 * author: chenxkang
 * time  : 17/5/5
 * desc  : 电影票
 */

public class MovieTicket {

    private Discount discount;
    private double price;

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return discount.calculate(this.price);
    }

}
