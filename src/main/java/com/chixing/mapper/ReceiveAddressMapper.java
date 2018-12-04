package com.chixing.mapper;

import com.chixing.entity.ReceiveAddress;
import com.chixing.entity.ReceiveAddressExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ReceiveAddressMapper继承基类
 */
@Repository
public interface ReceiveAddressMapper extends MyBatisBaseDao<ReceiveAddress, Integer> {

    /* 判断该用户有几个收件地址 */
    Integer selectAddressCounts(Integer clientId);

    /* 选择客户的地址 */
    List<ReceiveAddress> selectClientAddress(Integer clientId);

    ReceiveAddress selectClient2Address(Integer clientId);
}