package com.chixing.controllerr;

import com.chixing.entity.Client;
import com.chixing.service.ClientService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/clientInfo")
public class ClientInfoController {

    @Autowired
    private ClientService clientService;

/*------------------------------------修改信息--------------------------------------*/
    //修改客户信息
    @RequestMapping("clientUpdate")
    public ModelAndView clientUpdate(String clientField1,String clientGender, String clientAge, String clientEmail, String clientAddress,HttpSession session){
        System.out.println("=***==***="+","+clientGender+","+clientAge+","+clientEmail+","+clientAddress+","+clientField1);
        ModelAndView modelAndView = new ModelAndView();

        Integer gender = Integer.parseInt(clientGender);
        Integer age = Integer.parseInt(clientAge);
        Client client = (Client)session.getAttribute("client");
        //清除一开始登录时保存在session中的client对象
        session.removeAttribute("client");

        client.setClientField1(clientField1);
        client.setClientGender(gender);
        client.setClientAge(age);
        client.setClientEmail(clientEmail);
        client.setClientAddress(clientAddress);

        System.out.println("修改之后的"+client);

        Integer rows = clientService.modifiy(client);
        System.out.println("rows===="+rows);

        session.setAttribute("client",client);
        modelAndView.setViewName("client/personInfo");
        return modelAndView;
    }

}
