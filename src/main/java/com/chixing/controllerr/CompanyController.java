package com.chixing.controllerr;


import com.chixing.entity.*;

import com.chixing.service.*;
import com.chixing.util.DesignPageModel;
import com.chixing.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/company")
public class CompanyController extends HttpServlet{
    @Autowired
    private CompanyService companyService;
    @Autowired
    private RenderingImgService renderingImgService;

    @Autowired
    private DesignService designService;
    @Autowired
    private DesignerService designerService;

     @Autowired
    private CompanyEvaluationService companyEvaluationService;


    @RequestMapping("allByPage")
    public ModelAndView selectAllByPage(HttpServletRequest request){
        String  currenPageCodeStr = request.getParameter("page");
        System.out.println("当前页码是" + currenPageCodeStr);
        //1.获得页面中传过来的页码
        PageModel<Company> page = new PageModel<Company>();
        if (currenPageCodeStr == null){  //说明是首页
            page.setCurrentPageCode(1);
            page.setTotalRecord(companyService.selectCount());
            int totalPage = page.getTotalRecord() % page.getPageSize() == 0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() + 1;
            page.setTotalPages(totalPage);
            page.setStartRecord(0);
        }else { //不是首页
            Integer currentPageCode = Integer.parseInt(currenPageCodeStr) ;
            page.setCurrentPageCode(currentPageCode);
            page.setTotalRecord(companyService.selectCount());
            int totalPage = page.getTotalRecord() % page.getPageSize() == 0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() +1;
            page.setTotalPages(totalPage);
            page.setStartRecord((page.getCurrentPageCode()-1) * page.getPageSize());
        }

        Map<Company,List<RenderingImg>> map = new HashMap<>();
        //查询所有公司
        List<Company> companyList = companyService.selectAll(page);
        List<Company> companies = companyService.queryEightCompany();
        //  page.setModelList(companyList);
        //绑定公司与效果图
        for (Company company : companyList){
            List<RenderingImg> renderingImgList = renderingImgService.selectByCompanyId(company.getCompanyId());
            System.out.println("company name =" + company.getCompanyName() + "img length =" + renderingImgList.size());
            map.put(company,renderingImgList);
        }
        System.out.println("map" + map);
        // page.setModelList(companyList);
        //根据公司id查询素有图片 list ----modelAndview

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("map",map);
        modelAndView.addObject("pageModel",page);
        modelAndView.addObject("companies",companies);


        modelAndView.setViewName("company/company");

        return modelAndView;
    }


    @RequestMapping("companyDetail")
    public ModelAndView selectCompanyDetail(Integer companyId,HttpServletRequest request){
        System.out.println(companyId);

        String  currenPageCodeStr = request.getParameter("page");
        //1.获得页面中传过来的页码
        DesignPageModel<CompanyEvaluation> page = new DesignPageModel<CompanyEvaluation>();
        if (currenPageCodeStr == null){  //说明是首页
            page.setCurrentPageCode(1);
            page.setPageSize(3);
            page.setEndRecord(companyId);
            page.setTotalRecord(companyEvaluationService.getCountCompanyEvaluationByPage(companyId));
            int totalPage = page.getTotalRecord() % page.getPageSize() == 0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() + 1;
            page.setTotalPages(totalPage);
            page.setStartRecord(0);
        }else { //不是首页
            Integer currentPageCode = Integer.parseInt(currenPageCodeStr) ;
            page.setPageSize(3);
            page.setEndRecord(companyId);
            page.setCurrentPageCode(currentPageCode);
            page.setTotalRecord(companyEvaluationService.getCountCompanyEvaluationByPage(companyId));
            int totalPage = page.getTotalRecord() % page.getPageSize() == 0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() +1;
            page.setTotalPages(totalPage);
            page.setStartRecord((page.getCurrentPageCode()-1) * page.getPageSize());
        }


        Integer count = companyService.selectCountDesign(companyId);
        Company company = companyService.selectById(companyId);

        List<Designer> designerList = designerService.getDesignerByCompanyId(companyId);
        List<Design> designList = designService.getDesignByCompanyId(companyId);
        List<RenderingImg> imgList = companyService.selectCompanyImg(companyId);
        List<HashMap<String ,Object>> evaluationMapList= companyEvaluationService.getCompanyEvaluation(companyId);

        System.out.println(imgList);
        System.out.println("设计方案======" + designList);


        ModelAndView modelAndView = new ModelAndView();


        modelAndView.addObject("count",count);
        modelAndView.addObject("company",company);
        modelAndView.addObject("imgList",imgList);
        modelAndView.addObject("designList",designList);
        modelAndView.addObject("designerList",designerList);
        modelAndView.addObject("evaluationMapList",evaluationMapList);
        modelAndView.addObject("page",page);
        modelAndView.setViewName("company/company-list");

        return modelAndView;
    }


    @RequestMapping("companyDetailByPage")
    @ResponseBody
    public DesignPageModel<HashMap<String ,Object>> selectCompanyDetailByPage(String companyId,String currenPageCodeStr){

        Integer comId = Integer.parseInt(companyId);
        //1.获得页面中传过来的页码
        DesignPageModel<HashMap<String ,Object>> page = new DesignPageModel<>();

        List<HashMap<String ,Object>> evaluationMapList= companyEvaluationService.getCompanyEvaluation(comId);
        page.setModelList(evaluationMapList);

        if (currenPageCodeStr == null){  //说明是首页
            page.setCurrentPageCode(1);
            page.setPageSize(3);
            page.setEndRecord(comId);
            page.setTotalRecord(companyEvaluationService.getCountCompanyEvaluationByPage(comId));
            int totalPage = page.getTotalRecord() % page.getPageSize() == 0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() + 1;
            page.setTotalPages(totalPage);
            page.setStartRecord(0);
        }else { //不是首页
            Integer currentPageCode = Integer.parseInt(currenPageCodeStr) ;
            page.setPageSize(3);
            page.setEndRecord(comId);
            page.setCurrentPageCode(currentPageCode);
            page.setTotalRecord(companyEvaluationService.getCountCompanyEvaluationByPage(comId));
            int totalPage = page.getTotalRecord() % page.getPageSize() == 0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() +1;
            page.setTotalPages(totalPage);
            page.setStartRecord((page.getCurrentPageCode()-1) * page.getPageSize());
        }
        return page;
    }


    @RequestMapping(value = "getWithConditions",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public  PageModel<Company>  selectCompanyWithConditions(String designStyle,
                                                          String companyLocation,
                                                          String minPriceStr,
                                                          String maxPriceStr,
                                                          String currenPageCodeStr) throws UnsupportedEncodingException {


        designStyle =   URLDecoder.decode(designStyle,"utf-8");
        companyLocation =   URLDecoder.decode(companyLocation,"utf-8");
        System.out.println("designStyle =========" + designStyle);
        //1.获取页面的数据
        Object[] conditions = {null,null,null,null,null};
        PageModel<Company> page = new PageModel<>();

        if(designStyle !=null && !designStyle.equals("不限")) conditions[0]= designStyle;
        if(companyLocation !=null && !companyLocation.equals("不限")) conditions[1]= companyLocation;
        if(minPriceStr !=null && !minPriceStr.equals("不限")  && !minPriceStr.equals("null") ) conditions[2]= Double.valueOf(minPriceStr)*10000;
        if(maxPriceStr !=null && !maxPriceStr.equals("不限") && !maxPriceStr.equals("null") ) conditions[3]= Double.valueOf(maxPriceStr)*10000;
        conditions[4] = page;
        Integer currenPageCode = Integer.parseInt(currenPageCodeStr);


        if (currenPageCode == 0){  //说明是首页
            page.setCurrentPageCode(1);
            page.setTotalRecord(companyService.getCountWithConditions(conditions));
            System.out.println("***********是首页***********");
            int totalPage = page.getTotalRecord() % page.getPageSize() == 0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() + 1;
            page.setTotalPages(totalPage);
            page.setStartRecord(0);
        }else { //不是首页
            page.setCurrentPageCode(currenPageCode);
            page.setTotalRecord(companyService.getCountWithConditions(conditions));
            int totalPage = page.getTotalRecord() % page.getPageSize() == 0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() +1;
            page.setTotalPages(totalPage);
            page.setStartRecord((page.getCurrentPageCode()-1) * page.getPageSize());
        }


        /*Map<Company,List<RenderingImg>> map = new HashMap<>();*/
        //查询所有公司
        List<Company> companyList = companyService.getCompanyWithConditions(conditions);


        for (Company company : companyList){
            List<RenderingImg> renderingImgList = renderingImgService.selectByCompanyId(company.getCompanyId());
             company.setField1(renderingImgList.get(0).getRenderingImagesPath()+","+renderingImgList.get(1).getRenderingImagesPath()
                                +","+renderingImgList.get(2).getRenderingImagesPath()+","+renderingImgList.get(3).getRenderingImagesPath() );

             System.out.println("company =================" +company);
        }
        System.out.println("companyList " + companyList);

        page.setModelList(companyList);

        return page;
    }

}


