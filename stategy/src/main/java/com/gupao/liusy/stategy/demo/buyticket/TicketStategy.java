package com.gupao.liusy.stategy.demo.buyticket;

import java.util.HashMap;
import java.util.Map;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 19:00
 */
public class TicketStategy {
    public static final String BUS = "bus";
    public static final String TRAIN = "train";
    public static final String FLIGHT = "flight";
    public static final String DEFAULT_PAY = TRAIN;

    private static Map<String, Transportation> map = new HashMap<String, Transportation>();
    static {
        map.put(BUS,new Bus());
        map.put(TRAIN,new Train());
        map.put(FLIGHT,new Flight());
    }

    public static Transportation get(String key){
        if(!map.containsKey(key)){
            return map.get(DEFAULT_PAY);
        }
        return map.get(key);
    }
}