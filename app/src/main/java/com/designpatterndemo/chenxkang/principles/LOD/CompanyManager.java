package com.designpatterndemo.chenxkang.principles.LOD;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import static com.designpatterndemo.chenxkang.principles.LOD.LODFragment.LOD_TAG;

/**
 * author: chenxkang
 * time  : 17/3/31
 * desc  : 总公司管理者
 */

public class CompanyManager {

    /**
     * 获得总公司所有成员的ID
     *
     * @return
     */
    public List<Employee> getAllEmployees(){
        List<Employee> empList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Employee employee = new Employee();
            employee.setEmp_id("总公司成员ID：" + i);
            empList.add(employee);
        }
        return empList;
    }

    /**
     * 打印所有成员ID
     *
     * @param subMgr 分公司管理者
     */
    public void  printAllEmployees(SubCompanyManager subMgr){

        Log.i(LOD_TAG, "printAllEmployees: 打印所有成员ID");

        Log.i(LOD_TAG, "总公司员工ID -> 开始打印");
        List<Employee> empList = this.getAllEmployees();
        for (Employee emp : empList){
            Log.i(LOD_TAG, emp.getEmp_id());
        }

        Log.i(LOD_TAG, "分公司员工ID -> 开始打印");
        List<SubEmployee> subList = subMgr.getAllSubEmployees();
        for (SubEmployee sub : subList){
            Log.i(LOD_TAG, sub.getSub_emp_id());
        }

    }

    /**
     * 打印所有成员ID
     *
     * @param subMgr 分公司管理者
     */
    public void printAllEmployees1(SubCompanyManager subMgr){

        Log.i(LOD_TAG, "printAllEmployees: 打印所有成员ID");

        Log.i(LOD_TAG, "总公司员工ID -> 开始打印");
        List<Employee> empList = this.getAllEmployees();
        for (Employee emp : empList){
            Log.i(LOD_TAG, emp.getEmp_id());
        }

        Log.i(LOD_TAG, "分公司员工ID -> 开始打印");
        subMgr.printAllSubEmployees();


    }
}
