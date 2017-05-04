package com.designpatterndemo.chenxkang.patterns.flyweight;

import java.util.Hashtable;

/**
 * author: chenxkang
 * time  : 17/4/25
 * desc  : 享元工厂类
 */

public class ChessmanFactory {

    private static Hashtable hashtable;

    public ChessmanFactory() {
        hashtable = new Hashtable();
        Chessman blackChessman,whiteChessman;
        blackChessman = new BlackChessman();
        hashtable.put("b",blackChessman);
        whiteChessman = new WhiteChessman();
        hashtable.put("w", whiteChessman);
    }

    /**
     * 通过key来获取存储在Hashtable中的享元对象
     *
     * @param color key值
     * @return
     */
    public Chessman getChessman(String color){
        return (Chessman) hashtable.get(color);
    }
}
