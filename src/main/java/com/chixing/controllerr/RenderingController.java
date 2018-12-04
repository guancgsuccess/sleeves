package com.chixing.controllerr;


import com.chixing.entity.Company;
import com.chixing.entity.Rendering;
import com.chixing.entity.RenderingImg;
import com.chixing.service.CompanyService;
import com.chixing.service.RenderingImgService;
import com.chixing.service.RenderingService;
import com.chixing.util.PageModel;
import com.chixing.util.RenderingPageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/rendering")
public class RenderingController {

    @Autowired
    RenderingService renderingService;
    @Autowired
    private RenderingImgService renderingImgService;
    @Autowired
    private CompanyService companyService;



    @RequestMapping("renderingAll")
    public ModelAndView getRenderingAll(HttpServletRequest request){

    String currentPageCodeStr = request.getParameter("page");
    System.out.println("当前页码为:" +currentPageCodeStr);

    RenderingPageModel<Rendering> page = new RenderingPageModel<>();

    if(currentPageCodeStr == null){
        page.setCurrentPageCode(1);  //设置当前页为首页
        page.setTotalRecord(renderingService.queryRenderingAllCount()); //获得到总共有多少效果图
        //计算总页数
        int totalPage = page.getTotalRecord() % page.getPageSize() ==0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() +1;
        System.out.println("总页数:"+totalPage);
        page.setTotalPages(totalPage);
        page.setStartRecord(0);
    }else{
        Integer currentPageCode = Integer.parseInt(currentPageCodeStr);
        System.out.println("currentPageCode:"+currentPageCode);
        page.setCurrentPageCode(currentPageCode);

        page.setTotalRecord(renderingService.queryRenderingAllCount());
        int totalPage = page.getTotalRecord() % page.getPageSize() ==0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() +1;
        page.setTotalPages(totalPage);
        page.setStartRecord((page.getCurrentPageCode()-1) * page.getPageSize());
    }

    List<Rendering> renderingList = renderingService.queryRenderingAllByPage(page);

    ModelAndView modelAndView = new ModelAndView();

    modelAndView.addObject("renderingList",renderingList);
    modelAndView.addObject("page",page);
    modelAndView.setViewName("rendering/renderingAll");
    return modelAndView;
}

    @RequestMapping("getRenderingWithConditions")
    @ResponseBody
    public RenderingPageModel<Rendering> selectRenderingWithConditions(String renderingStyle,
                                                              String renderingHouseType,
                                                              String minRenderingArea,
                                                              String maxRenderingArea,
                                                              String currenPageCodeStr) throws UnsupportedEncodingException {

        renderingStyle =   URLDecoder.decode(renderingStyle,"utf-8");
        renderingHouseType =   URLDecoder.decode(renderingHouseType,"utf-8");
        //1.获取页面的数据
        Object[] conditions = {null,null,null,null,null};

        RenderingPageModel<Rendering> page = new RenderingPageModel<>();
        if(renderingStyle !=null && !renderingStyle.equals("不限")) conditions[0]= renderingStyle;
        if(renderingHouseType !=null && !renderingHouseType.equals("不限")) conditions[1]= renderingHouseType;
        if(minRenderingArea !=null && !minRenderingArea.equals("不限")  && !minRenderingArea.equals("null") ) conditions[2]= Float.valueOf(minRenderingArea);
        if(maxRenderingArea !=null && !maxRenderingArea.equals("不限") && !maxRenderingArea.equals("null") ) conditions[3]= Float.valueOf(maxRenderingArea);
        conditions[4] = page;

        Integer currenPageCode = Integer.parseInt(currenPageCodeStr);
        if (currenPageCode == 0){  //说明是首页
            page.setCurrentPageCode(1);
            page.setTotalRecord(renderingService.getCountByConditions(conditions));
            System.out.println("***********是首页***********");
            int totalPage = page.getTotalRecord() % page.getPageSize() == 0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() + 1;
            page.setTotalPages(totalPage);
            page.setStartRecord(0);
        }else { //不是首页
            page.setCurrentPageCode(currenPageCode);
            page.setTotalRecord(renderingService.getCountByConditions(conditions));
            int totalPage = page.getTotalRecord() % page.getPageSize() == 0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() +1;
            page.setTotalPages(totalPage);
            page.setStartRecord((page.getCurrentPageCode()-1) * page.getPageSize());
        }

        List<Rendering> renderingList = renderingService.getRenderingByConditions(conditions);

        System.out.println("查询出来的效果图集合 : " + renderingList);

        page.setModelList(renderingList);

        return page;

    }

    @RequestMapping("renderingDetail")
    public ModelAndView getRenderingDetail(Integer renderingId){
        List<RenderingImg> renderingImgList = renderingImgService.selectByRenderingId(renderingId);
        List<Company> companyList = companyService.selectThreeCompany();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("renderingImgList",renderingImgList);
        modelAndView.addObject("companyList",companyList);
        modelAndView.setViewName("rendering/renderingDetail");
        return modelAndView;
    }

}
