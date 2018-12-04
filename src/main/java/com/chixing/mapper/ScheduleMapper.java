package com.chixing.mapper;

import com.chixing.entity.Schedule;
import org.springframework.stereotype.Repository;

/**
 * ScheduleMapper继承基类
 */
@Repository
public interface ScheduleMapper extends MyBatisBaseDao<Schedule, Integer> {
}