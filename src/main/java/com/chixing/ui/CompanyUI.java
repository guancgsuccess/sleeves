package com.chixing.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/companyUI")
public class CompanyUI {

    @RequestMapping("companyAll")
    public void companyAll(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/company/company.jsp").forward(httpServletRequest,httpServletResponse);
    }
    //公司详情页面
    @RequestMapping("companyDetail")
    public void companyDetail(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/company/company-list.jsp").forward(httpServletRequest,httpServletResponse);
    }



}
