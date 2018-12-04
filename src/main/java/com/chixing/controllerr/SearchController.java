package com.chixing.controllerr;

import com.chixing.entity.Company;
import com.chixing.entity.RenderingImg;
import com.chixing.mapper.CompanyMapper;
import com.chixing.service.CompanyService;
import com.chixing.service.RenderingImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@Controller
@RequestMapping("/search")
public class SearchController extends HttpServlet {
    @Autowired
    CompanyService companyService;
    @Autowired
    CompanyMapper companyMapper;
    @Autowired
    RenderingImgService renderingImgService;


    @RequestMapping("searchCompany")
    @ResponseBody
    public List<Company> searchCompany(String news) throws UnsupportedEncodingException {
        String message = URLDecoder.decode(news,"utf-8");

        System.out.println(message);
       List<Company> companyList = companyMapper.selectCompanyBySearch(message);

       for (Company c:companyList){
           List<RenderingImg> renderingImgList = renderingImgService.selectByCompanyId(c.getCompanyId());
           c.setField1(renderingImgList.get(0).getRenderingImagesPath()+","+renderingImgList.get(1).getRenderingImagesPath()
                   +","+renderingImgList.get(2).getRenderingImagesPath()+","+renderingImgList.get(3).getRenderingImagesPath() );
       }
        return companyList;
    }

}
