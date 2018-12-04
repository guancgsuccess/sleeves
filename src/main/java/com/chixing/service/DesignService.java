package com.chixing.service;

import com.chixing.entity.Design;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.crypto.Des;

import java.util.List;

@Service
public interface DesignService {

    //根据公司ID查询方案
    public List<Design> getDesignByCompanyId(Integer companyId);

    Design queryDesignById(Integer designId);

    //根据设计师id查询方案
    Integer queryDesignCountByDesignerId(Integer designerId);

    //根据设计师id查询当前设计师做过的方案的信息
    List<Design> queryDesignByDesignerId(Integer designerId);

    //根据公司Id分页查询公司Id
    public List<Design> getDesignByPage(Object[] args);

    //根据公司Id查询方案个数
    public Integer getDesignCount(Integer companyId);
}
