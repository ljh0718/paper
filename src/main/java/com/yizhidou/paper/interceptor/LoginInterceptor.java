package com.yizhidou.paper.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登陆拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(
            HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {
        HttpSession session = request.getSession();
        /*if(session.getAttribute("pid") == null){
                response.sendRedirect("/web/login.html");
            return false;
        }*/
        return true;
    }
}
