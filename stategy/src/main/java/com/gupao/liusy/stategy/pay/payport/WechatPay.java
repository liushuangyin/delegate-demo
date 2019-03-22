package com.gupao.liusy.stategy.pay.payport;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 18:55
 */
public class WechatPay extends Payment{
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}