package com.gupao.liusy.stategy.demo.buyticket;

import com.gupao.liusy.stategy.pay.Order;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 18:56
 */
public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("liusy");
        System.out.println(ticket.buy("bus").toString());
        System.out.println(ticket.buy("train").toString());
        System.out.println(ticket.buy("flight").toString());

    }
}