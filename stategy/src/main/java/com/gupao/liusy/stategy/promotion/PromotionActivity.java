package com.gupao.liusy.stategy.promotion;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 18:14
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        promotionStrategy.doPromotion();
    }
}