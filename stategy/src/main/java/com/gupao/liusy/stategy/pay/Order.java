package com.gupao.liusy.stategy.pay;

import com.gupao.liusy.stategy.MsgResult;
import com.gupao.liusy.stategy.pay.payport.Payment;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 18:35
 */
public class Order {
    private String uid;
    private String orderId;
    private double price;


    public Order(String uid,String orderId,double price){
        this.uid = uid;
        this.orderId = orderId;
        this.price = price;
    }

    public MsgResult pay(String paykey){
        Payment payment = PayStategy.get(paykey);
        return payment.pay(this.uid,this.price);
    }
}
