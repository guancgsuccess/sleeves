package com.chixing.service;

import com.chixing.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {

    //根据客户id查询客户
    Client queryClientById(Integer clientId);

    //根据客户姓名查询客户
    Client queryClientByName(String clientName);

    //查询所有客户
    List<Client> queryAllClient();

    //根据邮箱查询客户
    Client queryClientByEmail(String clientEmail);

    //根据手机号查询客户
    Client queryClientByPhone(Long clientTelephone);

    //根据邮箱和密码查询客户
    Client queryClientByEmailAndPwd(String clientEmail, String clientPassword);

    //根据手机号和密码查询客户
    Client queryClientByPhoneAndPwd(Long clientTelephone, String clientPassword);

    //添加客户
    int save(Client client);

    //根据客户id删除客户
    int remove(Integer clientId);

    //修改客户信息
    int modifiy(Client client);
}
