package com.chixing.service;

import com.chixing.entity.Designer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DesignerService {

    //查询设计师根据CompanyId
    public List<Designer> getDesignerByCompanyId(Integer companyId);

    //根据方案id查询设计师
    Designer queryDesignerByDesignId(Integer designId);

    //根据设计师id查询设计师
    Designer queryDesignerById(Integer designerId);
}
