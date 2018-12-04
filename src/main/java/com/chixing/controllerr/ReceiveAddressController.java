package com.chixing.controllerr;

import com.chixing.entity.Company;
import com.chixing.entity.Design;
import com.chixing.entity.ReceiveAddress;
import com.chixing.service.CompanyService;
import com.chixing.service.DesignService;
import com.chixing.service.ReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;

@Controller
@RequestMapping("/receiveAddress")
public class ReceiveAddressController {

    @Autowired
    private ReceiveAddressService receiveAddressService;
    @Autowired
    private DesignService designService;
    @Autowired
    private CompanyService companyService;


    /* 点击我的地址首先判断该客户是否有过地址 */
    @RequestMapping("clientIsAddress")
    @ResponseBody
    public List<ReceiveAddress> clientIsAddress(Integer clientId,HttpSession session){
        System.out.println("address clientId :" +clientId);
        List<ReceiveAddress> receiveAddressList = receiveAddressService.queryClientAddress(clientId);
        return receiveAddressList;
    }

    @RequestMapping("countClientIsAddress")
    @ResponseBody
    public Integer countClientIsAddress(Integer clientId,HttpSession session){
        System.out.println("address clientId :" +clientId);
        Integer counts = receiveAddressService.queryAddressCounts(clientId);
        return counts;
    }

    /* 由地址id获取对应地址*/
    @RequestMapping("getAddressByAddressId")
    @ResponseBody
    public ModelAndView getAddressByAddressId(Integer addressId,HttpSession session){
        System.out.println("修改地址是的 addressId:" +addressId);
        ReceiveAddress receiveAddress = receiveAddressService.queryAddressById(addressId);

        session.setAttribute("receiveAddress",receiveAddress);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("receiveAddress",receiveAddress);
        modelAndView.setViewName("receive_address/update_address");
        return modelAndView;
    }


    //增加一个新地址
    @RequestMapping("saveNewAddress")
    @ResponseBody
    public Integer saveNewAddress(ReceiveAddress address,HttpSession session){

        System.out.println("接受到的地区名:" +address.getAddressName());
        System.out.println("接受到的详细地址:" +address.getAddressDetail());
        System.out.println("接受到的收件人:" +address.getClientName());
        System.out.println("接受到的手机号:" +address.getClientTelephone());
        System.out.println("接收到的用户Id:" +address.getClientId());

        Integer rows = receiveAddressService.insertAddress(address);
        session.setAttribute("receiveAddress",address);
        return rows;
    }

    /* 修改收件地址 */
    @RequestMapping("updateReceiveAddress")
    @ResponseBody
    public Integer updateReceiveAddress(ReceiveAddress receiveAddress,HttpSession session){

        System.out.println("接受到的地区名:" +receiveAddress.getAddressName());
        System.out.println("接受到的地址Id:" +receiveAddress.getAddressId());
        System.out.println("接受到的详细地址:" +receiveAddress.getAddressDetail());
        System.out.println("接受到的收件人:" +receiveAddress.getClientName());
        System.out.println("接受到的手机号:" +receiveAddress.getClientTelephone());
        System.out.println("接收到的用户Id:" +receiveAddress.getClientId());
        System.out.println("defaultAddress: " + receiveAddress.getDefaultAddress());
        System.out.println("fields1: " + receiveAddress.getFields1());

        System.out.println("如今的地址为:" +receiveAddress);

        Integer rows = receiveAddressService.modifyAddress(receiveAddress);
        session.setAttribute("receiveAddress",receiveAddress);
        return rows;
    }

    //删除收件地址
    @RequestMapping("deleteAddress")
    @ResponseBody
    public void deleteAddress(Integer addressId, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer rows = receiveAddressService.deleteAddress(addressId);
        request.getRequestDispatcher("/WEB-INF/receive_address/exist_address.jsp").forward(request,response);
    }

/*------------------- 查询当前用户的地址和所选的方案和对应公司-------------------------------*/
    @RequestMapping("getAllData")
    @ResponseBody
    public Integer getAllData(Integer clientId,Integer designId,Integer companyId,HttpSession session){
        ReceiveAddress receiveAddress = receiveAddressService.queryClient2Address(clientId);
        System.out.println("收件地址:" +receiveAddress);

        Design design = designService.queryDesignById(designId);
        System.out.println("方案为:" +design);

        Company company = companyService.queryCompanyById(companyId);
        System.out.println("公司为:" +company);

        session.setAttribute("receiveAddress",receiveAddress);
        session.setAttribute("design",design);
        session.setAttribute("company",company);

        return 1;
    }
}
