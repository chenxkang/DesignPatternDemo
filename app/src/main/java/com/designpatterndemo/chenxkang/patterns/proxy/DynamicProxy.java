package com.designpatterndemo.chenxkang.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * author: chenxkang
 * time  : 17/4/26
 * desc  : 动态代理
 */

public class DynamicProxy implements InvocationHandler {

    private Object obj;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(obj,args);
    }
}
