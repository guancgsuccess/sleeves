package com.chixing.service;

import com.chixing.entity.Company;
import com.chixing.entity.RenderingImg;
import com.chixing.util.PageModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {

    //根据公司id查询公司信息
    Company queryCompanyById(Integer companyId);

    List<Company> queryEightCompany();

    //获得所有公司
    List<Company> selectAll(PageModel<Company> page);

    //获得公司个数
    Integer selectCount();

    //查询设计案例
    Integer selectCountDesign(Integer companyId);

    //根据id查询公司
    public Company selectById(Integer companyId);

    //获得单个公司图片
    List<RenderingImg> selectCompanyImg(Integer companyId);

    //多条件动态语句查询公司
    List<Company> getCompanyWithConditions(Object[] args);

    //查询符合条件的公司个数
    Integer getCountWithConditions(Object[] args);

    //根据方案id查询到公司信息
    Company queryCompanyByDesignId(Integer designId);

    //根据设计师id查询到公司信息
    String queryCompanyByDesignerId(Integer designerId);

    //查询三个公司
    List<Company> selectThreeCompany();

    List<Company> selectCompanyByLocation(String cityName);

    /*-----------------------收藏----------------------*/
    //根据客户id查询该客户收藏过公司的信息
    List<Company> queryCompanyByClientId(Integer clientId);
}
