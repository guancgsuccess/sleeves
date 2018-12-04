package com.chixing.service.impl;

import com.chixing.entity.CompanyCollection;
import com.chixing.mapper.CompanyCollectionMapper;
import com.chixing.service.CompanyCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyCollectionServiceImpl implements CompanyCollectionService {

    @Autowired
    private CompanyCollectionMapper companyCollectionMapper;

    @Override
    public Integer save(CompanyCollection companyCollection) {
        Integer counts = companyCollectionMapper.insert(companyCollection);
        return counts;
    }

    @Override
    public Integer update(CompanyCollection companyCollection) {
        return companyCollectionMapper.updateByPrimaryKey(companyCollection);
    }

    @Override
    public Integer queryCollectionCounts(Integer clientId) {
        return  companyCollectionMapper.selectCollectionCounts(clientId);

    }

    @Override
    public List<CompanyCollection> queryCompanyCollection(Integer clientId) {
        return companyCollectionMapper.selectCompanyCollection(clientId);
    }

    @Override
    public CompanyCollection queryIsCollection(Integer clientId, Integer companyId) {
        return companyCollectionMapper.selectIsCollection(clientId,companyId);
    }
}
