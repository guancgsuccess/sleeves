package com.chixing.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("designerUI")
public class DesignerUI {

    //跳转到设计师详情页面
    @RequestMapping("designerDetail")
    public void designerDetail(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        httpServletRequest.getRequestDispatcher("/designer/designerDetail.jsp").forward(httpServletRequest,httpServletResponse);
    }

    //跳转到案列页面
    @RequestMapping("design")
    public void designer(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        httpServletRequest.getRequestDispatcher("/designer/designDetail.jsp").forward(httpServletRequest,httpServletResponse);
    }
}
