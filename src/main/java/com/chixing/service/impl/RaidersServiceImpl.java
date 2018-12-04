package com.chixing.service.impl;

import com.chixing.entity.Raiders;
import com.chixing.mapper.RaidersMapper;
import com.chixing.service.RaidersService;
import com.chixing.util.RaidersPageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaidersServiceImpl implements RaidersService {

    @Autowired
    private RaidersMapper raidersMapper;


    @Override
    public List<Raiders> queryRaidersAll() {
        List<Raiders> raidersList = raidersMapper.selectRaidersAll();
        return raidersList;
    }

    @Override
    public Integer queryRaidersAllCounts() {
        Integer counts = raidersMapper.selectRaidersAllCount();
        return counts;
    }

    @Override
    public RaidersPageModel<Raiders> queryRaidersAllByPage(RaidersPageModel<Raiders> page) {
        List<Raiders> raidersList = raidersMapper.selectRaidersAllByPage(page);
        page.setModelList(raidersList);
        return page;
    }

    @Override
    public List<Raiders> queryEightRaiders() {
        List<Raiders> raidersList = raidersMapper.selectEightRaiders();
        return raidersList;
    }

    @Override
    public List<Raiders> queryFourRaiders() {
        List<Raiders> raidersList = raidersMapper.selectFourRaiders();
        return raidersList;
    }

    @Override
    public Raiders queryRaidersById(Integer raidersId) {
        Raiders raiders = raidersMapper.selectByPrimaryKey(raidersId);
        return raiders;
    }

    @Override
    public Integer updateRaiders(Raiders raiders) {
        Integer rows = raidersMapper.updateByPrimaryKey(raiders);
        return rows;
    }
}
