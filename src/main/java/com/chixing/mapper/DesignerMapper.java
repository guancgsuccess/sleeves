package com.chixing.mapper;

import com.chixing.entity.Designer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * DesignerMapper继承基类
 */
@Repository
public interface DesignerMapper extends MyBatisBaseDao<Designer, Integer> {

    //根据公司ID查询设计师
    List<Designer> selectDesignerByCompanyId(Integer companyId);

    Designer selectDesignerByDesignId(Integer designId);



}