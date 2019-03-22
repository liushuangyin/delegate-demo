package com.gupao.liusy.stategy.promotion;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 18:14
 */
public class PromotionTest {
    public static void main1(String[] args) {
        PromotionActivity emptyPromotion = new PromotionActivity(new EmptyPromotion());
        emptyPromotion.execute();

        PromotionActivity groupbuyPromotion = new PromotionActivity(new GroupbuyPromotion());
        groupbuyPromotion.execute();
    }

    public static void main2(String[] args) {
        PromotionActivity promotionActivity = null;
        String promotionKey = "grpup";
        if(promotionKey.equals("grpup")){
            promotionActivity = new PromotionActivity(new GroupbuyPromotion());
        }else if (promotionKey.equals("cashback")){
            promotionActivity = new PromotionActivity(new CashBackPromotion());
        }else{
            promotionActivity = new PromotionActivity(new EmptyPromotion());
        }
        promotionActivity.execute();
    }

    public static void main(String[] args) {
        String promotionType = "GROUPBY";
        PromotionActivity activity = PromotionStrtegyFactory.getPromotionActivityInstance(promotionType);
        activity.execute();
    }

}