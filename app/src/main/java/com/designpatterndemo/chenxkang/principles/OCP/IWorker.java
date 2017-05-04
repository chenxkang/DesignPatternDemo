package com.designpatterndemo.chenxkang.principles.OCP;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : 工人接口
 */

public interface IWorker {

    /**
     * 工人编号
     *
     * @param name 编号
     */
    void name(String name);

    /**
     * 工人角色
     *
     * @param role 角色
     */
    void role(String role);

    /**
     * 工人任务
     *
     * @param job 任务
     */
    void doing(String job);
}
