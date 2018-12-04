package com.chixing.mapper;

import com.chixing.entity.DesignOrder;
import com.chixing.entity.DesignOrderExample;
import com.chixing.entity.OrderAndResign;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * DesignOrderMapper继承基类
 */
@Repository
public interface DesignOrderMapper extends MyBatisBaseDao<DesignOrder, Integer> {

    //根据订单编号查询订单
    DesignOrder selectDesignOrderByNo(String designOrderNo);

    //查询该用户所有订单
    List<DesignOrder> selectAllOrder(Integer clientId);

    //查询客户已经支付的订单
    List<OrderAndResign> selectOrderYes(Integer clientId);

    //查询客户未支付的订单
    List<OrderAndResign> selectOrderNo(Integer clientId);

    List<OrderAndResign> select(Integer clientId);

    //根据客户id和方案id查询到该订单
    DesignOrder selectOrder(@Param("clientId") Integer clientId, @Param("designId") Integer designId);
}