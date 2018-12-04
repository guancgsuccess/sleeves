package com.chixing.controllerr;

import com.chixing.entity.Company;
import com.chixing.entity.Design;
import com.chixing.entity.Designer;
import com.chixing.entity.RenderingImg;
import com.chixing.service.CompanyService;
import com.chixing.service.DesignService;
import com.chixing.service.DesignerService;
import com.chixing.service.RenderingImgService;
import com.chixing.util.DesignPageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("design")
public class DesignController {

    @Autowired
    private DesignService designService;
    @Autowired
    private DesignerService designerService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private RenderingImgService renderingImgService;

    @RequestMapping("getDesignDetail")
    public ModelAndView getDesignDetail(Integer designId){
        System.out.println("接受到的方案id为；" +designId);

        Design design = designService.queryDesignById(designId);
        System.out.println("设计方案为:" +design);
        Designer designer = designerService.queryDesignerByDesignId(designId);
        Company company = companyService.queryCompanyByDesignId(designId);
        System.out.println("公司为:"+company);
        List<RenderingImg> renderingImgList = renderingImgService.queryByDesignId(designId);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("design",design);
        modelAndView.addObject("designer",designer);
        modelAndView.addObject("company",company);
        modelAndView.addObject("renderingImgList",renderingImgList);
        modelAndView.setViewName("designer/designDetail");
        return modelAndView;
    }



    @RequestMapping("getDesignByPage")
    public ModelAndView getDesignByPage(Integer companyId, String pages,HttpServletRequest request) throws UnsupportedEncodingException {

        //String companyName = new String(request.getParameter("companyName").getBytes("iso-8859-1"), "utf-8");
        String companyName = request.getParameter("companyName");
        System.out.println("公司名字 = " + companyName);
        System.out.println("公司Id = " + companyId);
        String  currenPageCodeStr = pages;

        Object[] args = {null,null};

        //1.获得页面中传过来的页码
        DesignPageModel<Design> page = new DesignPageModel<>();
        if (currenPageCodeStr == null){  //说明是首页
            page.setPageSize(9);
            page.setCurrentPageCode(1);
            page.setTotalRecord(designService.getDesignCount(companyId));
            int totalPage = page.getTotalRecord() % page.getPageSize() == 0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() + 1;
            page.setTotalPages(totalPage);
            page.setStartRecord(0);
        }else { //不是首页
            Integer currentPageCode = Integer.parseInt(currenPageCodeStr) ;
            page.setPageSize(9);
            page.setCurrentPageCode(currentPageCode);
            page.setTotalRecord(designService.getDesignCount(companyId));
            int totalPage = page.getTotalRecord() % page.getPageSize() == 0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() +1;
            page.setTotalPages(totalPage);
            page.setStartRecord((page.getCurrentPageCode()-1) * page.getPageSize());
        }

        args[0] = companyId;
        args[1] = page;



        List<Design> designList = designService.getDesignByPage(args);


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("page",page);
        modelAndView.addObject("designList",designList);
        modelAndView.addObject("companyName",companyName);
        modelAndView.addObject("companyId",companyId);
        modelAndView.setViewName("design/designTotal");

        return modelAndView;

    }






}
