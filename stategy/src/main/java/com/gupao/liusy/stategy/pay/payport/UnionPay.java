package com.gupao.liusy.stategy.pay.payport;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 18:56
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 100;
    }
}