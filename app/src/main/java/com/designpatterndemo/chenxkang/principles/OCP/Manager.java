package com.designpatterndemo.chenxkang.principles.OCP;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : 包工头
 */

public class Manager {

    /**
     * 给工人命名编号
     *
     * @param worker 工人
     * @param id     编号
     */
    public void nameWorker(IWorker worker, int id){
        worker.name("我的工人编号是：" + id);
    }

    /**
     * 给工人分配角色和任务
     *
     * @param worker
     */
    public void allocateTask(IWorker worker){
        worker.role("我是搬砖工");
        worker.doing("我去搬砖啦！");
    }


}
