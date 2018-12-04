package com.chixing.service.impl;

import com.chixing.mapper.CompanyEvaluationMapper;
import com.chixing.service.CompanyEvaluationService;
import com.chixing.util.DesignPageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class CompanyEvaluationServiceImpl implements CompanyEvaluationService {
    @Autowired
    CompanyEvaluationMapper companyEvaluationMapper;

    @Override
    public List<HashMap<String, Object>> getCompanyEvaluation(Integer companyId) {
        return companyEvaluationMapper.selectCompanyEvaluation(companyId);
    }

    @Override
    public List<HashMap<String, Object>> getCompanyEvaluationByPage(Object[] args) {
        HashMap<String ,Object> param = new HashMap<>();
        //companyId,startRecord,pageSize
        param.put("companyId",args[0]);
        param.put("startRecord",((DesignPageModel)args[1]).getStartRecord());
        param.put("pageSize",((DesignPageModel)args[1]).getPageSize());

        List<HashMap<String ,Object>> resultMapList = companyEvaluationMapper.selectCompanyEvaluationByPage(param);
        //ce.evaluation_time ,ce.evaluation_content,client_name,client_profile
        System.out.println("resultMapList = " + resultMapList);
        for (HashMap<String ,Object> map:resultMapList){
            String clientName = (String)map.get("client_name");
            String clientProfile = (String)map.get("client_profile");
            Date evaluationTime = (Date)map.get("evaluation_time");
            String evaluationContent = (String)map.get("evaluation_content");
            System.out.println("clientName = " + clientName + ",clientProfile = " + clientProfile + ",evaluationTime = " + evaluationTime + ",evaluationContent = " + evaluationContent);
        }
        return resultMapList;
    }

    @Override
    public Integer getCountCompanyEvaluationByPage(Integer companyId) {
        return companyEvaluationMapper.selectCountCompanyEvaluationByPage(companyId);
    }
}
