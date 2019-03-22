package com.gupao.liusy.stategy.demo.buyticket;

import com.gupao.liusy.stategy.MsgResult;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/22 11:01
 */
public class Flight implements Transportation {
    @Override
    public MsgResult goHome(String uid) {
        return new MsgResult(500, "购票失败", "全国老赖，不允许乘坐飞机");
    }
}