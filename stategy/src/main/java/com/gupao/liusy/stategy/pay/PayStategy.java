package com.gupao.liusy.stategy.pay;

import com.gupao.liusy.stategy.pay.payport.AliPay;
import com.gupao.liusy.stategy.pay.payport.JDPay;
import com.gupao.liusy.stategy.pay.payport.Payment;
import com.gupao.liusy.stategy.pay.payport.UnionPay;
import com.gupao.liusy.stategy.pay.payport.WechatPay;
import com.sun.xml.internal.ws.message.source.PayloadSourceMessage;

import java.util.HashMap;
import java.util.Map;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 19:00
 */
public class PayStategy {
    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String, Payment> map = new HashMap<String, Payment>();
    static {
        map.put(ALI_PAY,new AliPay());
        map.put(JD_PAY,new JDPay());
        map.put(WECHAT_PAY,new WechatPay());
        map.put(UNION_PAY,new UnionPay());
    }

    public static Payment get(String key){
        if(!map.containsKey(key)){
            return map.get(DEFAULT_PAY);
        }
        return map.get(key);
    }
}