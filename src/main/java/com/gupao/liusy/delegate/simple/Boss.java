package com.gupao.liusy.delegate.simple;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 15:48
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }
}