package com.chixing.mapper;

import com.chixing.entity.Collection;
import com.chixing.entity.CollectionKey;
import org.springframework.stereotype.Repository;

/**
 * CollectionMapper继承基类
 */
@Repository
public interface CollectionMapper extends MyBatisBaseDao<Collection, CollectionKey> {
}