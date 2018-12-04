package com.chixing.mapper;

import com.chixing.entity.CompanyEvaluation;
import com.chixing.entity.CompanyEvaluationExample;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * CompanyEvaluationMapper继承基类
 */
@Repository
public interface CompanyEvaluationMapper extends MyBatisBaseDao<CompanyEvaluation, Integer> {

    //根据分页查询公司评论
    public List<HashMap<String,Object>> selectCompanyEvaluationByPage(HashMap<String ,Object> hashMap);

    //查询公司前三条评论
    public List<HashMap<String,Object>> selectCompanyEvaluation(Integer companyId);
    //统计公司评论数
    public Integer selectCountCompanyEvaluationByPage(Integer companyId);


}