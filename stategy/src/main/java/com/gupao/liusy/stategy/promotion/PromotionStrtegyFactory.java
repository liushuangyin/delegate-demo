package com.gupao.liusy.stategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 18:23
 */
public class PromotionStrtegyFactory {

    private static Map<String, PromotionStrategy> map = new HashMap<String, PromotionStrategy>();

    static {
        map.put(PromotionType.CASHBACK, new CashBackPromotion());
        map.put(PromotionType.GROUPBUY, new GroupbuyPromotion());
        map.put(PromotionType.COUPON, new CouPromotion());
    }

    private PromotionStrtegyFactory() {}

    public interface PromotionType {
        String COUPON = "COUPON";
        String GROUPBUY = "GROUPBUY";
        String CASHBACK = "CASHBACK";
    }

    public static PromotionActivity getPromotionActivityInstance(String promotionType) {
        if (map.containsKey(promotionType)) {
            return new PromotionActivity(map.get(promotionType));
        }
        return new PromotionActivity(new EmptyPromotion());
    }
}