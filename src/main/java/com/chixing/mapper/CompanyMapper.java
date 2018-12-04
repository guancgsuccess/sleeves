package com.chixing.mapper;

import com.chixing.entity.Company;
import com.chixing.entity.Design;
import com.chixing.entity.RenderingImg;
import com.chixing.util.PageModel;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * CompanyMapper继承基类
 */
@Repository
public interface CompanyMapper extends MyBatisBaseDao<Company, Integer> {


    /* 查询前四个公司 */
    List<Company> selectEightCompany();

    /* 查询所有的公司 */
    List<Company> selectAllCompany(PageModel<Company> page);

    /* 根据公司名查询公司 */
    Company selectCompanyByName(String companyName);

    //获得公司图片
    public List<RenderingImg> selectCompanyImg(Integer companyId);

    //查询设计案例
    Integer selectCountDesign(Integer companyId);

    //获得公司个数
    Integer selectCount();

    //获得公司方案
    List<Design> selectCompanyDesign(Integer companyId);

    //多条件动态语句查询公司
    List<Company> selectCompanyWithConditions(HashMap<String ,Object> hashMap);

    //查询符合条件的公司个数
    Integer selectCountWithConditions(HashMap<String ,Object> hashMap);

    /* 查询前3个公司 */
    List<Company> selectThreeCompany();

    //根据方案id查询到公司
    Company selectCompanyByDesignId(Integer designId);

    //根据设计师id查询到公司姓名
    String selectCompanyByDesignerId(Integer designerId);

    //根据公司所在地查询公司
    List<Company> selectCompanyByLocation(String cityName);

    //根据客户id查询该客户收藏过公司的信息
    List<Company> selectCompanyByClientId(Integer clientId);

    //根据条件查询公司
    List<Company> selectCompanyBySearch(String news);



}