package com.chixing.service.impl;

import com.chixing.entity.DesignOrder;
import com.chixing.mapper.DesignOrderMapper;
import com.chixing.service.DesignOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignOrderServiceImpl implements DesignOrderService {

    @Autowired
    private DesignOrderMapper designOrderMapper;

    @Override
    public Integer save(DesignOrder designOrder) {
        return designOrderMapper.insert(designOrder);
    }

    @Override
    public DesignOrder queryDesignOrderByNo(String designOrderNo) {
        return designOrderMapper.selectDesignOrderByNo(designOrderNo);
    }

    @Override
    public List<DesignOrder> queryAllOrder(Integer clientId) {
        return designOrderMapper.selectAllOrder(clientId);
    }

}
