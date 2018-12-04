package com.chixing.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public interface CompanyEvaluationService {

    //查询公司所有的评论
    public List<HashMap<String ,Object>> getCompanyEvaluation(Integer companyId);

    //根据分页查询公司评论
    public List<HashMap<String ,Object>> getCompanyEvaluationByPage(Object[] args);

    //统计公司评论数
    public Integer getCountCompanyEvaluationByPage(Integer companyId);

}
