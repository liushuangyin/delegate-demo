package com.gupao.liusy.stategy.demo.buyticket;

import com.gupao.liusy.stategy.MsgResult;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/22 11:09
 */
public class Ticket {

    private String uid;
    public Ticket(String uid){
        this.uid = uid;
    }
    public MsgResult buy(String key){
        Transportation transportation = TicketStategy.get(key);
        return transportation.goHome(this.uid);
    }
}