package com.gupao.liusy.delegate.mvc;

import com.gupao.liusy.delegate.mvc.controller.MemberController;
import com.gupao.liusy.delegate.mvc.controller.OrderController;
import com.gupao.liusy.delegate.mvc.controller.SystemController;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.HttpServletBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/21 16:14
 */
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatcher(req,resp);
    }

    private void doDispatcher(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String uri = req.getRequestURI();
        String mid = req.getParameter("mid");
        if("getMemberById".equals(uri)){
            new MemberController().getMemberById(mid);
        }else if("getOrderById".equals(uri)){
            new OrderController().getOrderById(mid);
        }else if("login".equals(uri)){
            new SystemController().login(mid);
        }else{
            resp.getWriter().write("404 not found");
        }
    }
}