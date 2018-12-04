package com.chixing.mapper;

import com.chixing.entity.OrderEvaluation;
import org.springframework.stereotype.Repository;

/**
 * OrderEvaluationMapper继承基类
 */
@Repository
public interface OrderEvaluationMapper extends MyBatisBaseDao<OrderEvaluation, Integer> {
}