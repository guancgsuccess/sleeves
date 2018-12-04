package com.chixing.controllerr;

import com.chixing.entity.Client;
import com.chixing.service.ClientService;
import com.chixing.util.ForgetPwdUtil;
import com.chixing.util.MD5Utils;
import com.chixing.util.RegisterUtil;
import com.chixing.util.UpdatePwdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 封装了Client所有的前端请求操作
 * 次级控制器
 */
@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

/*------------------------------------注册模块----------------------------------------*/
    //客户注册
    @PostMapping("clientRegister")
    public ModelAndView clientRegister(Client c, String verificationCode, HttpSession session) throws IOException {
        System.out.println("验证码：" +verificationCode);

        String password = c.getClientPassword();
        System.out.println("密码：" +password);

        //将客户的密码进行加密放入数据库
        String mdPwd = MD5Utils.MD5(password);
        System.out.println("加密后的密码:" +mdPwd);

        //取出session的验证码
        String verificationCodeSession = String.valueOf(session.getAttribute("verificationCode"));
        System.out.println("session中的验证码:" +verificationCodeSession);

        //清除session中的验证码和时间
        session.removeAttribute("verificationCode");
        session.removeAttribute("setCodeTime");

        ModelAndView modelAndView = new ModelAndView();
        c.setClientPassword(mdPwd);
        c.setClientProfile("/img/profile.jpg");
        System.out.println("注册保存的客户:"+c);

        if(verificationCodeSession.equals(verificationCode)){
            System.out.println("输出验证码正确!!!");
            int rows = clientService.save(c);
            if(rows>0){
                System.out.println("一开始的c:"+c);
                Client client = clientService.queryClientByPhone(c.getClientTelephone());
                System.out.println("现在的客户:"+client);
                session.setAttribute("client",client);
                modelAndView.setViewName("page/index");
            }
        }else{
            System.out.println("输出验证码错误！");
            modelAndView.addObject("codeError","验证码错误");
            modelAndView.setViewName("client/register");
        }

        return modelAndView;
    }

    //传送注册验证码
    @RequestMapping("checkVerificationCode")
    public void checkVerificationCode(String clientTelephone,HttpSession session){
        System.out.println("接收到的手机号为:" +clientTelephone);
        RegisterUtil.getRequest2(clientTelephone);
        String verificationCode=RegisterUtil.codevalue.substring(13);

        //将短信验证码绑定在session中
        session.setAttribute("verificationCode",verificationCode);
        Long registerTime=System.currentTimeMillis();
        session.setAttribute("setCodeTime",registerTime);
    }

    // 判断手机号是否注册过
    @RequestMapping("isClientRegister")
    @ResponseBody
    public Integer isClientRegister(String clientTelephone){
        System.out.println("注册页面收到的手机号：" + clientTelephone);

        Long telephone = Long.parseLong(clientTelephone);
        Client client = clientService.queryClientByPhone(telephone);
        System.out.println("注册时判断的 client:"+client);

        if(client == null){
            return 0;   //客户还未注册
        }else{
            return 1;    //客户已经注册
        }
    }


/*-------------------------------------登录模块----------------------------------------*/
    //客户登录
    @RequestMapping("clientLogin")
    public ModelAndView clientLogin(String clientTelephone, String clientPassword, HttpSession session){
        System.out.println("client login start");
        System.out.println("客户密码:" + clientPassword);

        String mdPwd = MD5Utils.MD5(clientPassword);
        System.out.println("加密后的密码:" +mdPwd);

        ModelAndView modelAndView = new ModelAndView();

        Client client = null;
        //String emailRegex = "^[A-Za-z0-9\\u4e00-\\u9fa5]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$" ;
        String phoneRegex = "^[1][34578]\\d{9}$";

        if(clientTelephone.matches(phoneRegex)){
            System.out.println("这是手机号登录！");
            Long clientPhone = Long.parseLong(clientTelephone);
            client = clientService.queryClientByPhoneAndPwd(clientPhone,mdPwd);
            System.out.println("登录session中的客户信息："+client);
        }else{
            modelAndView.addObject("loginErrorMsg","手机号格式错误！");
            System.out.println("手机号格式错误！");
            modelAndView.setViewName("client/login");
        }

        if(client==null){
            modelAndView.addObject("loginErrorMsg","用户名或密码错误");
            modelAndView.setViewName("client/login");
        }else{
            session.setAttribute("client",client);
            System.out.println("登录session中的客户信息："+client);
            modelAndView.setViewName("page/index");
        }
        return modelAndView;
    }

    //客户退出
    @RequestMapping("clientOut")
    public ModelAndView clientOut(HttpServletRequest request){
        request.getSession().removeAttribute("client");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/index");
        return modelAndView;
    }

/*------------------------------------客户修改密码--------------------------------------*/

    //发送修改密码的验证码
    @RequestMapping("sendUpdateCode")
    public void sendUpdateCode(HttpSession session){
        Client c = (Client)session.getAttribute("client");
        String telephone = String.valueOf(c.getClientTelephone());

        UpdatePwdUtil.getRequest2(telephone);
        String validateCodeSMS = UpdatePwdUtil.codevalue.substring(13);
        session.setAttribute("validateCodeSMS",validateCodeSMS);
        Long registerTime=System.currentTimeMillis();
        session.setAttribute("setCodeTime",registerTime);
    }


/*-------------------------------------客户忘记密码-----------------------------------*/
    //第一步:收到页面上的手机号,验证身份信息
    @RequestMapping("forgetPwdFirstStrep")
    @ResponseBody
    public Integer forgetPwdFirstStrep(String clientTelephone, String validateCode, HttpSession session){

        System.out.println("页面接收的:"+clientTelephone+","+validateCode);
        //拿出session保存的图片验证码
        String validateCodeSession = String.valueOf(session.getAttribute("validation_code"));

        Long telephone = Long.parseLong(clientTelephone);

        //为了区别登录是保存的client,所以用client1
        Client client1 = clientService.queryClientByPhone(telephone);
        session.setAttribute("client1",client1);

        if(client1==null){
            return -1;  //表示客户还未注册
        }else if(!(validateCodeSession.equals(validateCode))){
            return 0;   //图形验证码错误
        }else{
            return 1;   //验证成功
        }
    }

    //第二步:收到修改密码的短信验证码
    @RequestMapping("getForgetPwd")
    public void getForgetPwd(HttpSession session){
        Client c = (Client)session.getAttribute("client1");
        String telephone = String.valueOf(c.getClientTelephone());

        ForgetPwdUtil.getRequest2(telephone);
        String forgetPwdVerificationCode =ForgetPwdUtil.codevalue; //.substring(13)

        session.setAttribute("forgetPwdVerificationCode",forgetPwdVerificationCode);
        Long setForgetPwdCodeTime=System.currentTimeMillis();
        session.setAttribute("setForgetPwdCodeTime",setForgetPwdCodeTime);
    }

    @RequestMapping("forgetPwdSecondStep")
    @ResponseBody
    public Integer forgetPwdSecondStep(String verificationCode,HttpSession session){
        //取出session中的忘记密码时发送的验证码
        String forgetPwdVerificationCodeSession = String.valueOf(session.getAttribute("forgetPwdVerificationCode"));
        System.out.println("forgetPwdVerificationCodeSession="+forgetPwdVerificationCodeSession);
        //清除session中的忘记密码时的验证码和时间
        session.removeAttribute("forgetPwdVerificationCode");
        session.removeAttribute("setForgetPwdCodeTime");
        System.out.println("页面过来的验证码:"+verificationCode);

        if(verificationCode.equals(forgetPwdVerificationCodeSession)){
            System.out.println("验证码匹配成功!!");
            return 1;
        }else{
            System.out.println("验证码匹配失败!!");
            return 0;
        }
    }

    //第三步:重新设置密码
    @PostMapping("forgetPwdThirdStrep")
    @ResponseBody
    public Integer forgetPwdThirdStrep(String clientPassword,String clientRePassword,HttpSession session){
        System.out.println("*******"+clientPassword+","+clientRePassword);
        Client client  = (Client)session.getAttribute("client1");
        System.out.println("client1111:"+client);

        if(clientPassword.equals(clientRePassword)){
            //将重置后的密码进行加密
            String encryptPwd = MD5Utils.MD5(clientPassword);
            client.setClientPassword(encryptPwd);
            System.out.println("client2222:"+client);

            clientService.modifiy(client);
            System.out.println("设置密码成功!!");
            return 1;
        }else{
            System.out.println("设置密码失败!!");
            return 0;
        }
    }


/*-----------------------------------------------------------------*/
//客户修改头像
@GetMapping("modifyHeadPortrait")
@ResponseBody
public Map<String,Object> modifyHeadPortrait(String headUrl, HttpSession session){
    Map<String,Object> map=new HashMap<>(5);
    Client client=(Client) session.getAttribute("client");
    client.setClientProfile(headUrl);

    Integer rows=clientService.modifiy(client);
    if(rows==1){
        map.put("msg",1);
    }
    return map;
}

}
