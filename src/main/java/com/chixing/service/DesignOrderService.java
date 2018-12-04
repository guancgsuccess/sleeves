package com.chixing.service;

import com.chixing.entity.DesignOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DesignOrderService {

    //添加订单
    Integer save(DesignOrder designOrder);

    //根据订单编号查询订单
    DesignOrder queryDesignOrderByNo(String designOrderNo);

    //查询客户所有订单
    List<DesignOrder> queryAllOrder(Integer clientId);


}
