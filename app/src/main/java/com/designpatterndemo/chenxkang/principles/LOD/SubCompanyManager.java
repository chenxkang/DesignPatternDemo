package com.designpatterndemo.chenxkang.principles.LOD;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import static com.designpatterndemo.chenxkang.principles.LOD.LODFragment.LOD_TAG;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : 分公司管理者
 */

public class SubCompanyManager {

    /**
     * 获得分公司所有成员的ID
     *
     * @return
     */
    public List<SubEmployee> getAllSubEmployees(){
        List<SubEmployee> subList = new ArrayList<>();
        for (int i = 10; i < 16; i++) {
            SubEmployee sub = new SubEmployee();
            sub.setSub_emp_id("分公司成员ID：" + i);
            subList.add(sub);
        }

        return subList;
    }

    /**
     * 打印分公司所有成员ID
     */
    public void printAllSubEmployees(){

        List<SubEmployee> subList = this.getAllSubEmployees();
        for (SubEmployee sub : subList){
            Log.i(LOD_TAG, sub.getSub_emp_id());
        }
    }
}
