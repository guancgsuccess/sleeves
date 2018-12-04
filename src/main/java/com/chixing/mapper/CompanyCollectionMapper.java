package com.chixing.mapper;

import com.chixing.entity.CompanyCollection;
import com.chixing.entity.CompanyCollectionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * CompanyCollectionMapper继承基类
 */
@Repository
public interface CompanyCollectionMapper extends MyBatisBaseDao<CompanyCollection, Integer> {


    //根据客户id查询到该客户收藏过多少公司
    Integer selectCollectionCounts(Integer clientId);

    //根据客户id查询该客户收藏记录
    List<CompanyCollection> selectCompanyCollection(Integer clientId);



    CompanyCollection selectIsCollection(@Param("clientId") Integer clientId,@Param("companyId") Integer companyId);

}