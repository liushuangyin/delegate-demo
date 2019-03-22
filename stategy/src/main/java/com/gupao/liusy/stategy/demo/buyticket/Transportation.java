package com.gupao.liusy.stategy.demo.buyticket;

import com.gupao.liusy.stategy.MsgResult;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/22 11:02
 */
public interface Transportation {
    MsgResult goHome(String uid);
}