package com.gupao.liusy.stategy;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 18:38
 */
public class MsgResult {

    private String msg;
    private Object data;
    private int code;

    public MsgResult( int code,Object data,String msg) {
        this.msg = msg;
        this.data = data;
        this.code = code;
    }

    @Override
    public String toString() {
        return "code:[" + code + "],msg:[" + msg + "]" + ",data:[" + data + "]";
    }
}