package com.chixing.service.impl;

import com.chixing.entity.Company;
import com.chixing.entity.RenderingImg;
import com.chixing.mapper.CompanyMapper;
import com.chixing.service.CompanyService;
import com.chixing.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public Company queryCompanyById(Integer companyId) {
        return companyMapper.selectByPrimaryKey(companyId);
    }

    @Override
    public List<Company> queryEightCompany() {
        List<Company> companyList = companyMapper.selectEightCompany();
        return companyList;
    }


    //获得公司图片
    @Override
    public List<RenderingImg> selectCompanyImg(Integer companyId) {
        return companyMapper.selectCompanyImg(companyId);
    }

    //获得所有公司
    @Override
    public List<Company> selectAll(PageModel<Company> page) {
        return companyMapper.selectAllCompany(page);
    }

    //获得公司个数
    @Override
    public Integer selectCount() {
        return companyMapper.selectCount();
    }

    //查询设计案例
    @Override
    public Integer selectCountDesign(Integer companyId) {
        return companyMapper.selectCountDesign(companyId);
    }

    @Override
    public Company selectById(Integer companyId) {
        return companyMapper.selectByPrimaryKey(companyId);
    }



    //多条件动态语句查询公司
    @Override
    public List<Company> getCompanyWithConditions(Object[] args) {
        //designStyle,companyLocation,minPrice,,maxPrice,startRecord,pageSize
        HashMap<String ,Object> parm = new HashMap<>();


        parm.put("designStyle",args[0]);//简约
        parm.put("companyLocation",args[1]);//null
        parm.put("minPrice",args[2]);//null
        parm.put("maxPrice",args[3]);//null
                          //  args[4]  null
        if (args[4] != null){ //null
            parm.put("startRecord",((PageModel)args[4]).getStartRecord());
            parm.put("pageSize",(((PageModel)args[4]).getPageSize()));
        }
        System.out.println("多条件动态语句查询公司里的args = " + args[0] + "," + args[1] +","+args[2]+","+args[3]+","+args[4]);

        System.out.println("parm = " + parm);

        List<Company> companyList = companyMapper.selectCompanyWithConditions(parm);

        return companyList;
    }

    //查询符合条件的公司个数
    @Override
    public Integer getCountWithConditions(Object[] args) {
        HashMap<String ,Object> parm = new HashMap<>();
        System.out.println("查询符合条件的公司个数里的args = " + args[0] + "," + args[1] +","+args[2]+","+args[3]);

        parm.put("designStyle",args[0]);
        parm.put("companyLocation",args[1]);
        parm.put("minPrice",args[2]);
        parm.put("maxPrice",args[3]);
        Integer count = companyMapper.selectCountWithConditions(parm);
        return count;
    }

    @Override
    public Company queryCompanyByDesignId(Integer designId) {
        Company company = companyMapper.selectCompanyByDesignId(10001);
        return company;
    }

    @Override
    public String queryCompanyByDesignerId(Integer designerId) {
        String companyName = companyMapper.selectCompanyByDesignerId(designerId);
        return companyName;
    }


    @Override
    public List<Company> selectThreeCompany() {
        return companyMapper.selectThreeCompany();
    }

    @Override
    public List<Company> selectCompanyByLocation(String cityName) {
        return companyMapper.selectCompanyByLocation(cityName);
    }

    @Override
    public List<Company> queryCompanyByClientId(Integer clientId) {
        return companyMapper.selectCompanyByClientId(clientId);
    }

}
