package com.gupao.liusy.delegate.simple;

import org.springframework.web.servlet.DispatcherServlet;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 15:58
 */
public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("java",new Leader());
        new Boss().command("html5",new Leader());
    }
}