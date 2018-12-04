package com.chixing.mapper;

import com.chixing.entity.Raiders;
import com.chixing.entity.RaidersExample;
import com.chixing.util.RaidersPageModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ReidersMapper继承基类
 */
@Repository
public interface RaidersMapper extends MyBatisBaseDao<Raiders, Integer> {

    //获得所有效果图的信息
    List<Raiders> selectRaidersAll();

    //获得效果图的数量
    Integer selectRaidersAllCount();

    //根据页数分配
    List<Raiders> selectRaidersAllByPage(RaidersPageModel<Raiders> page);

    List<Raiders> selectByExample(RaidersExample example);

    List<Raiders> selectEightRaiders();

    List<Raiders> selectFourRaiders();

}