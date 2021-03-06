package com.chixing.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("raidersUI")
public class RaidersUI {

    //跳转到所有装修攻略页面
    @RequestMapping("raidersAll")
    public void raidersAll(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/raiders/raidersAll.jsp").forward(httpServletRequest,httpServletResponse);
    }

}
