package com.chixing.mapper;

import com.chixing.entity.LoginStatus;
import org.springframework.stereotype.Repository;

/**
 * LoginStatusMapper继承基类
 */
@Repository
public interface LoginStatusMapper extends MyBatisBaseDao<LoginStatus, Integer> {
}