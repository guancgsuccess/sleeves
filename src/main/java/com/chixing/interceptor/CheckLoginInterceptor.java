package com.chixing.interceptor;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckLoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
        String requestUri = request.getRequestURI();
        System.out.println("===============================requestUri = " + requestUri);

        if(request.getSession().getAttribute("client") ==null){
            System.out.println("===============================用户未登录===============");
            request.getRequestDispatcher("/clientUI/login").forward(request,response);
            return false;
        }else{//用户已登录
            System.out.println("===============================用户已经登录===============");
            return  true;
        }


    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
