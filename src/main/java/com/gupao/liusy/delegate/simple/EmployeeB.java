package com.gupao.liusy.delegate.simple;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 15:52
 */
public class EmployeeB implements IEmployee {

    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我现在开始干" + command );
    }
}