package com.gupao.liusy.stategy.pay;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 18:56
 */
public class PayTest {
    public static void main(String[] args) {
        Order order = new Order("liusy","0001",301.01);
        System.out.println(order.pay("JdPay").toString());
        System.out.println(order.pay("AliPay").toString());

    }
}