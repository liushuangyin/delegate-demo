package com.gupao.liusy.delegate.simple;

import org.springframework.web.servlet.DispatcherServlet;

import java.util.HashMap;
import java.util.Map;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 15:50
 */
public class Leader implements IEmployee {

    private Map<String,IEmployee> map = new HashMap<String, IEmployee>();

    public Leader(){
        map.put("java",new EmployeeA());
        map.put("html5",new EmployeeB());
    }

    @Override
    public void doing(String command) {
        map.get(command).doing(command);
    }
}