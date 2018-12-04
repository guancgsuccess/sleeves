package com.chixing.service;

import com.chixing.entity.Raiders;
import com.chixing.util.RaidersPageModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RaidersService {

    List<Raiders> queryRaidersAll();

    Integer queryRaidersAllCounts();

    //根据页数分配
    RaidersPageModel<Raiders> queryRaidersAllByPage(RaidersPageModel<Raiders> page);

    //根据点赞数排名查询前六的攻略
    List<Raiders> queryEightRaiders();

    //查询4个攻略
    List<Raiders> queryFourRaiders();

    //根据攻略id查询攻略
    Raiders queryRaidersById(Integer raidersId);

    Integer updateRaiders(Raiders raiders);



}
