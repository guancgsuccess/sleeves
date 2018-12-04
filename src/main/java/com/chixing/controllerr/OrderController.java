package com.chixing.controllerr;

import com.chixing.entity.Design;
import com.chixing.entity.DesignOrder;
import com.chixing.entity.OrderAndResign;
import com.chixing.entity.ReceiveAddress;
import com.chixing.mapper.DesignOrderMapper;
import com.chixing.service.DesignOrderService;
import com.chixing.service.DesignService;
import com.chixing.service.ReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private DesignOrderService designOrderService;
    @Autowired
    private DesignService designService;
    @Autowired
    private ReceiveAddressService receiveAddressService;
    @Autowired
    private DesignOrderMapper designOrderMapper;

    @RequestMapping("get2SubmitOrder")
    @ResponseBody
    public Integer get2SubmitOrder(Integer clientId, Integer designId, Integer addressId, HttpSession session) {
        System.out.println("客户id为:" + clientId + "," + "方案id为:" + designId + "地址id为:" + addressId);

        ReceiveAddress receiveAddress = receiveAddressService.queryAddressById(addressId);
        System.out.println("收件地址为:" + receiveAddress);
        String telephone = receiveAddress.getClientTelephone();
        System.out.println("手机号码为:" + telephone);

        Design design = designService.queryDesignById(designId);
        System.out.println("查询出来的方案为:" + design);

        design.setField2(telephone);
        System.out.println("添加手机号码后的方案为:" + design);
        session.setAttribute("design", design);
        return 1;

    }


    @RequestMapping("submitDesignOrder")
    @ResponseBody
    public Integer submitDesignOrder(Integer clientId, Integer designId) {
        System.out.println("客户id为:" + clientId + "," + "方案id为:" + designId);

        //随机生成唯一的订单编号
        int r1 = (int) (Math.random() * (10));//产生2个0-9的随机数
        int r2 = (int) (Math.random() * (10));
        long now = System.currentTimeMillis();//一个13位的时间戳
        String orderNo = String.valueOf(r1) + String.valueOf(r2) + String.valueOf(now);

        DesignOrder designOrder = new DesignOrder(orderNo, clientId, designId, new Date(), 1, null, null);
        System.out.println("方案订单为:" + designOrder);

        Integer rows = designOrderService.save(designOrder);
        System.out.println("===行数为===" + rows);

        if (rows > 0) {
            return 1;   //代表支付成功
        } else {
            return 0;    //代表支付失败
        }

    }


    @RequestMapping("get2CancelOrder")
    @ResponseBody
    public Integer get2CancelOrder(Integer clientId, Integer designId) {
        System.out.println("客户id为:" + clientId + "," + "方案id为:" + designId);
        //随机生成唯一的订单编号
        int r1 = (int) (Math.random() * (10));//产生2个0-9的随机数
        int r2 = (int) (Math.random() * (10));
        long now = System.currentTimeMillis();//一个13位的时间戳
        String orderNo = String.valueOf(r1) + String.valueOf(r2) + String.valueOf(now);

        DesignOrder designOrder = new DesignOrder(orderNo, clientId, designId, new Date(), 0, null, null);
        System.out.println("方案订单为:" + designOrder);

        Integer rows = designOrderService.save(designOrder);
        System.out.println("===行数为===" + rows);

        if (rows > 0) {
            return 1;   //取消订单成功
        } else {
            return 0;   //取消订单失败
        }
    }

    /*-----------------------------------加载我的订单页面时--------------------------------*/
    @RequestMapping("loadOrderInfo")
    @ResponseBody
    public List<OrderAndResign> loadOrderInfo(Integer clientId) {
        System.out.println("客户id:"+clientId);

        List<OrderAndResign> orderAndResignList = designOrderMapper.select(clientId);
        return orderAndResignList;
    }

    /*-------------------------- 点击未支付时 --------------------------------------------*/
    @RequestMapping("clickNoPay")
    @ResponseBody
    public List<OrderAndResign> clickNoPay(Integer clientId){
        List<OrderAndResign> orderAndResignList = designOrderMapper.selectOrderNo(clientId);
        return orderAndResignList;
    }


    /*-------------------------- 点击已支付时 --------------------------------------------*/
    @RequestMapping("clickYesPay")
    @ResponseBody
    public List<OrderAndResign> clickYesPay(Integer clientId){
        List<OrderAndResign> orderAndResignList = designOrderMapper.selectOrderYes(clientId);
        return orderAndResignList;
    }

    /*---------------------------- 代付款前往付款页面---------------------------------------*/
    @RequestMapping("goToPay")
    @ResponseBody
    public Integer goToPay(Integer clientId, Integer designId,HttpSession session){
            ReceiveAddress receiveAddress = receiveAddressService.queryClient2Address(clientId);
            System.out.println("收藏地址为:" +receiveAddress);

            Design design = designService.queryDesignById(designId);
            design.setField2(receiveAddress.getClientTelephone());
            System.out.println("此时design为:" +design);
            session.setAttribute("design",design);
            return 1;
    }

    /*------------------------------ 取消后重新付款 --------------------------------------------*/
    @RequestMapping("rePay")
    @ResponseBody
    public Integer rePay(Integer clientId, Integer designId){
            DesignOrder designOrder = designOrderMapper.selectOrder(clientId,designId);
            designOrder.setDesignOrderStatus(1);

            int rows = designOrderMapper.updateByPrimaryKey(designOrder);
            System.out.println("行数为:" +1);
            return rows;
    }

}
