package com.chixing.service.impl;

import com.chixing.entity.Designer;
import com.chixing.mapper.DesignerMapper;
import com.chixing.service.DesignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignerServiceImpl implements DesignerService {

    @Autowired
    DesignerMapper designerMapper;

    @Override
    public List<Designer> getDesignerByCompanyId(Integer companyId) {
        return designerMapper.selectDesignerByCompanyId(companyId);
    }

    @Override
    public Designer queryDesignerByDesignId(Integer designId) {
        Designer designer = designerMapper.selectDesignerByDesignId(designId);
        return designer;
    }

    @Override
    public Designer queryDesignerById(Integer designerId) {
        Designer designer = designerMapper.selectByPrimaryKey(designerId);
        return designer;
    }
}
