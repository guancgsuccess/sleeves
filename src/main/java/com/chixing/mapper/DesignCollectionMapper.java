package com.chixing.mapper;

import com.chixing.entity.DesignCollection;
import com.chixing.entity.DesignCollectionExample;
import org.springframework.stereotype.Repository;

/**
 * DesignCollectionMapper继承基类
 */
@Repository
public interface DesignCollectionMapper extends MyBatisBaseDao<DesignCollection, Integer> {
}