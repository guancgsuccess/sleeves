package com.chixing.ui;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("clientUI")
public class ClientUI {

    //跳转到注册页面
    @RequestMapping("register")
    public void register(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/client/register.jsp").forward(httpServletRequest,httpServletResponse);
    }

    //跳转到登录页面
    @RequestMapping("login")
    public void login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/client/login.jsp").forward(httpServletRequest,httpServletResponse);
    }

    //跳转到个人中心页面
    @RequestMapping("personCenter")
    public void personCenter(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/client/personCenter.jsp").forward(httpServletRequest,httpServletResponse);
    }

    //跳转到个人信息页面
    @RequestMapping("personInfo")
    public void personInfo(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/client/personInfo.jsp").forward(httpServletRequest,httpServletResponse);
    }

    //跳转到忘记密码页面
    @RequestMapping("forgetPwd")
    public void forgetPwd(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/client/forgetPwd.jsp").forward(httpServletRequest,httpServletResponse);
    }

    //跳转到修改密码页面
    @RequestMapping("updatePwd")
    public void updatePwd(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/client/updatePwd.jsp").forward(httpServletRequest,httpServletResponse);
    }


    //跳转到关于我们的页面
    @RequestMapping("aboutUs")
    public void aboutUs(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/client/aboutUs.jsp").forward(httpServletRequest,httpServletResponse);
    }

}
