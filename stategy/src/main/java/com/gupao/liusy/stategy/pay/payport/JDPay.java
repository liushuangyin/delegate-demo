package com.gupao.liusy.stategy.pay.payport;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 18:53
 */
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 300;
    }
}