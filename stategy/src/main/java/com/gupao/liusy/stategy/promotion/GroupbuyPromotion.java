package com.gupao.liusy.stategy.promotion;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 18:13
 */
public class GroupbuyPromotion implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("十人成团，销售8折优惠");
    }
}