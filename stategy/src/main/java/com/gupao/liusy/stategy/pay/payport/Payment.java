package com.gupao.liusy.stategy.pay.payport;

import com.gupao.liusy.stategy.MsgResult;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 18:47
 */
public abstract class  Payment {
    public abstract  String getName();
    protected abstract double queryBalance(String uid);

    public MsgResult pay(String uid,double price){
        if(queryBalance(uid)<price){
            return new MsgResult(500,"余额不足","支付失败");
        }
        return new MsgResult(200,"支付金额"+price,"支付成功");
    }
}