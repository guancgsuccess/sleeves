package com.chixing.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 负责跳转到主页
 */
@Controller
@RequestMapping("/")
public class IndexUI {

    //跳转到首页面
    @RequestMapping("index")
    public void page(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        httpServletRequest.getRequestDispatcher("/WEB-INF/page/index.jsp").forward(httpServletRequest,httpServletResponse);
    }

    //跳转到意见反馈页面
    @RequestMapping("advice")
    public void advice(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/client/advice.jsp").forward(httpServletRequest,httpServletResponse);
    }

    //跳转到空收藏页面
    @RequestMapping("emptyCollection")
    public void emptyCollection(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/collection/empty_collection.jsp").forward(httpServletRequest,httpServletResponse);
    }

    //跳转有收藏页面
    @RequestMapping("existCollection")
    public void existCollection(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/collection/exist_collection.jsp").forward(httpServletRequest,httpServletResponse);
    }


    //跳转到空地址页面
    @RequestMapping("emptyAddress")
    public void emptyAddress(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/receive_address/empty_address.jsp").forward(httpServletRequest,httpServletResponse);
    }

    //跳转有地址页面
    @RequestMapping("existAddress")
    public void existAddress(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/receive_address/exist_address.jsp").forward(httpServletRequest,httpServletResponse);
    }

    //跳转到保存地址页面
    @RequestMapping("saveAddress")
    public void saveAddress(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/receive_address/write_address.jsp").forward(httpServletRequest,httpServletResponse);
    }

    //跳转到确认地址页面
    @RequestMapping("sureOrder")
    public void sureOrder(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/order/sure_order.jsp").forward(httpServletRequest,httpServletResponse);
    }

    //跳转到确认地址页面
    @RequestMapping("orderPay")
    public void orderPay(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/order/order_pay.jsp").forward(httpServletRequest,httpServletResponse);
    }

    //跳转到确认地址页面
    @RequestMapping("cancelAfterPay")
    public void cancelAfterPay(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        System.out.println("enter cancelAfterPay");
        httpServletRequest.getRequestDispatcher("/WEB-INF/order/cancelAfterPay.jsp").forward(httpServletRequest,httpServletResponse);
    }

    @RequestMapping("search/{news}")
    public void search(@PathVariable String news, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        System.out.println("接收到的消息 = " + news);

        httpServletRequest.getRequestDispatcher("/WEB-INF/company/searchCompany.jsp?news="+news).forward(httpServletRequest,httpServletResponse);
    }

}
