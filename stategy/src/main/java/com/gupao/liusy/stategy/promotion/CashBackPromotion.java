package com.gupao.liusy.stategy.promotion;

/**
 * 说明：返现
 *
 * @author liusy
 * @date 2019/3/21 18:12
 */
public class CashBackPromotion implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满100返现20");
    }
}