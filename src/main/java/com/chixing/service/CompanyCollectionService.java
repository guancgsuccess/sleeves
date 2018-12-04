package com.chixing.service;

import com.chixing.entity.CompanyCollection;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyCollectionService {

     //添加该收藏
     Integer save(CompanyCollection companyCollection);

     //修改该收藏
     Integer update(CompanyCollection companyCollection);

     //根据客户id查询到该客户收藏的公司数量
     Integer queryCollectionCounts(Integer clientId);

     //根据客户id查询该客户收藏记录
     List<CompanyCollection> queryCompanyCollection(Integer clientId);

     //根据客户id和公司id查询当前客户是否已经收藏过该公司
     CompanyCollection queryIsCollection(Integer clientId,Integer companyId);
}
