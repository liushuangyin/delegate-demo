package com.gupao.liusy.stategy.promotion;

/**
 * 说明：无优惠
 *
 * @author liusy
 * @date 2019/3/21 18:10
 */
public class EmptyPromotion implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("没有优惠，爱咋咋的");
    }
}