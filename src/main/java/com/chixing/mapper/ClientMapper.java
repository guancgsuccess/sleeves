package com.chixing.mapper;

import com.chixing.entity.Client;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * ClientMapper继承基类
 */
@Repository
public interface ClientMapper extends MyBatisBaseDao<Client, Integer> {

    //查询所有客户
    List<Client> selectAllClient();

    //根据客户名查询客户
    Client selectClientByName(String clientName);

    //根据邮箱查询客户
    Client selectClientByEmail(String clientEmail);

    //根据手机号查询客户
    Client selectClientByPhone(Long clientTelephone);

    //根据邮箱号和密码查询客户
    Client selectClientByEmailAndPwd(Map<String, Object> map);

    //根据手机号和密码查询客户
    Client selectClientByPhoneAndPwd(Map<String, Object> map);
}