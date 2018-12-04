package com.chixing.controllerr;

import com.chixing.entity.Client;
import com.chixing.service.ClientService;
import com.chixing.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/updatePwd")
public class UpdatePwdController {

    @Autowired
    private ClientService clientService;

    //客户修改密码
    @PostMapping("clientUpdatePwd")
    public ModelAndView clientUpdatePwd(String validateCode, String verificationCode,
                                        String oldPassword, String newPassword, HttpSession session )
    {
        System.out.println(validateCode+","+verificationCode+","+oldPassword+","+newPassword);
        ModelAndView modelAndView = new ModelAndView();

        //拿出存在session中的图片验证码
        String validateCodeSession =  String.valueOf(session.getAttribute("validation_code"));
        System.out.println("图片验证码:" +validateCodeSession);
        //拿出存在session中的短信验证码
        String verificationCodeSession = String.valueOf(session.getAttribute("validateCodeSMS"));
        System.out.println("短信验证码:" +verificationCodeSession);
        //拿出session中的客户对象
        Client c = (Client)session.getAttribute("client");
        System.out.println("拿出session中的用户对象:" +c);

        //清除session中的图片验证码,短信验证码,客户对象
        session.removeAttribute("validation_code");
        session.removeAttribute("validateCodeSMS");
        session.removeAttribute("client");

        //将旧密码加密与数据库中的比较
        String encryptPwd = MD5Utils.MD5(oldPassword);
        if(!(encryptPwd.equals(c.getClientPassword()))){
            System.out.println("旧密码输入错误");
            modelAndView.addObject("oldPasswordError","旧密码输入错误");
            modelAndView.setViewName("client/updatePwd");
        }

        //把原先session中客户对象的信息封装到新的客户对象上
        Client client = c;
        System.out.println("修改后的用户；" +client);

        //把新输入的密码加到新的客户对象上
        //首先将新密码加密
        String encryptNewPwd = MD5Utils.MD5(newPassword);
        client.setClientPassword(encryptNewPwd);

        //判断图片验证码和短信验证码是否和后台接收的相等
        if(!(validateCodeSession.equals(validateCode))){
            System.out.println("==========执行了图形码错误的操作============");
            modelAndView.addObject("validateCodeError","图形码输入错误");
            modelAndView.setViewName("client/updatePwd");
        }else if(!(verificationCodeSession.equals(verificationCode))){
            System.out.println("==========执行了短信码错误的操作============");
            modelAndView.addObject("verificationCodeError","短信验证码输入错误");
            modelAndView.setViewName("client/updatePwd");
        }else{
            System.out.println("==========执行了修改密码的操作============");
            int rows= clientService.modifiy(client);
            System.out.println("rows="+rows);
            session.setAttribute("client",client);
            modelAndView.setViewName("client/updatePwd");
        }
        return modelAndView;
    }


}
