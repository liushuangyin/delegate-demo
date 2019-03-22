package com.gupao.liusy.stategy.demo.buyticket;

import com.gupao.liusy.stategy.MsgResult;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/22 11:01
 */
public class Train implements Transportation {
    @Override
    public MsgResult goHome(String uid) {
        return new MsgResult(200,"购票成功，K184 11车上铺","订单号00001");
    }
}