package com.chixing.controllerr;

import com.chixing.entity.Company;
import com.chixing.entity.Raiders;
import com.chixing.service.CompanyService;
import com.chixing.service.RaidersService;
import com.chixing.service.RenderingImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private RaidersService raidersService;


    @RequestMapping("loadCompanyInfo")
    @ResponseBody
    public List<Company> loadCompanyInfo(){
        List<Company> companyList = companyService.queryEightCompany();
        return companyList;
    }


    @RequestMapping("loadCompanyInfoByCity")
    @ResponseBody
    public List<Company> loadCompanyInfoByCity(String placeName){
        System.out.println("接受到的城市名:" +placeName);
        List<Company> companyList = companyService.selectCompanyByLocation(placeName);
        return companyList;
    }

    @RequestMapping("loadRaidersInfo")
    @ResponseBody
    public List<Raiders> loadRaidersInfo(){
        System.out.println("=====================");
        List<Raiders> raidersList = raidersService.queryFourRaiders();
        return raidersList;
    }
}
