package com.chixing.mapper;

import com.chixing.entity.Design;
import com.chixing.entity.Designer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * DesignMapper继承基类
 */
@Repository
public interface DesignMapper extends MyBatisBaseDao<Design, Integer> {

    //根据公司ID查询方案
    List<Design> selectDesignByCompanyId(Integer companyId);

    //根据设计师id查询当前设计师做过的方案的个数
    Integer selectDesignCountByDesignerId(Integer designerId);

    //根据设计师id查询当前设计师做过的方案的信息
    List<Design> selectDesignByDesignerId(Integer designerId);

    //根据公司Id分页查询所有方案
    List<Design> selectDesignByPage(HashMap<String ,Object> map);

    //根据公司查询方案个数
    Integer selectCount(Integer companyId);
}