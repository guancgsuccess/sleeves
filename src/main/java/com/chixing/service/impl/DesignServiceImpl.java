package com.chixing.service.impl;

import com.chixing.entity.Design;
import com.chixing.mapper.DesignMapper;
import com.chixing.service.DesignService;
import com.chixing.util.DesignPageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
@Service
public class DesignServiceImpl implements DesignService {

    @Autowired
    DesignMapper designMapper;

    @Override
    public List<Design> getDesignByCompanyId(Integer companyId) {
        return designMapper.selectDesignByCompanyId(companyId);
    }

    @Override
    public Design queryDesignById(Integer designId) {
        Design design = designMapper.selectByPrimaryKey(designId);
        return design;
    }

    @Override
    public Integer queryDesignCountByDesignerId(Integer designerId) {
        Integer counts = designMapper.selectDesignCountByDesignerId(designerId);
        return counts;
    }

    @Override
    public List<Design> queryDesignByDesignerId(Integer designerId) {
        List<Design> designList = designMapper.selectDesignByDesignerId(designerId);
        return designList;
    }

    @Override
    public List<Design> getDesignByPage(Object[] args) {

        HashMap<String ,Object> param = new HashMap<>();
        param.put("companyId",args[0]);
        param.put("startRecord",((DesignPageModel)args[1]).getStartRecord());
        param.put("pageSize",(((DesignPageModel)args[1]).getPageSize()));

        List<Design> designList = designMapper.selectDesignByPage(param);

        return designList;
    }

    @Override
    public Integer getDesignCount(Integer companyId) {
        return designMapper.selectCount(companyId);
    }

}
