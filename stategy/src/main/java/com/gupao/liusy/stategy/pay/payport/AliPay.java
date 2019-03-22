package com.gupao.liusy.stategy.pay.payport;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 18:54
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 1000;
    }
}