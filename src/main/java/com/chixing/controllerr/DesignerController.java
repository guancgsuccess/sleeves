package com.chixing.controllerr;

import com.chixing.entity.Company;
import com.chixing.entity.Design;
import com.chixing.entity.Designer;
import com.chixing.service.CompanyService;
import com.chixing.service.DesignService;
import com.chixing.service.DesignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("designer")
public class DesignerController {

    @Autowired
    private DesignerService designerService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private DesignService designService;

    @RequestMapping("getDesignerDetail")
    public ModelAndView getDesignerDetail(Integer designerId){
        System.out.println("接受到的设计师id为：" +designerId);
        Designer designer = designerService.queryDesignerById(designerId);
        System.out.println("设计师为:" +designer);
        String companyName = companyService.queryCompanyByDesignerId(designerId);
        System.out.println("公司名称为:" +companyName);
        Integer counts = designService.queryDesignCountByDesignerId(designerId);
        System.out.println("数量:" +counts);
        List<Design> designList = designService.queryDesignByDesignerId(designerId);
        System.out.println("查询到的方案：" +designList);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("designer",designer);
        modelAndView.addObject("companyName",companyName);
        modelAndView.addObject("counts",counts);
        modelAndView.addObject("designList",designList);
        modelAndView.setViewName("designer/designerDetail");
        return modelAndView;
    }
}
