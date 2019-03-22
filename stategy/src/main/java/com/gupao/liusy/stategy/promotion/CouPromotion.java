package com.gupao.liusy.stategy.promotion;

/**
 * 说明：优惠劵
 *
 * @author liusy
 * @date 2019/3/21 18:11
 */
public class CouPromotion implements  PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("优惠劵活动，满100减50");
    }
}