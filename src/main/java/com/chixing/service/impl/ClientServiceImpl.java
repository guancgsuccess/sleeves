package com.chixing.service.impl;

import com.chixing.entity.Client;
import com.chixing.mapper.ClientMapper;
import com.chixing.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public Client queryClientById(Integer clientId) {
        Client client = clientMapper.selectByPrimaryKey(clientId);
        return client;
    }

    @Override
    public Client queryClientByName(String clientName) {
        Client client = clientMapper.selectClientByName(clientName);
        return client;
    }

    @Override
    public List<Client> queryAllClient() {
        List<Client> clientList = clientMapper.selectAllClient();
        return clientList;
    }

    @Override
    public Client queryClientByEmail(String clientEmail) {
        Client client = clientMapper.selectClientByEmail(clientEmail);
        return client;
    }

    @Override
    public Client queryClientByPhone(Long clientTelephone) {
        Client client = clientMapper.selectClientByPhone(clientTelephone);
        return client;
    }

    @Override
    public Client queryClientByEmailAndPwd(String clientEmail, String clientPassword) {
        Map<String,Object> map = new HashMap<>();
        map.put("clientEmail",clientEmail);
        map.put("clientPassword",clientPassword);
        Client client = clientMapper.selectClientByEmailAndPwd(map);
        return client;
    }

    @Override
    public Client queryClientByPhoneAndPwd(Long clientTelephone, String clientPassword) {
        Map<String,Object> map = new HashMap<>();
        map.put("clientTelephone",clientTelephone);
        map.put("clientPassword",clientPassword);
        Client client = clientMapper.selectClientByPhoneAndPwd(map);
        return client;
    }

    @Override
    public int save(Client client) {
        int rows = clientMapper.insert(client);
        return rows;
    }

    @Override
    public int remove(Integer clientId) {
        int rows = clientMapper.deleteByPrimaryKey(clientId);
        return rows;
    }

    @Override
    public int modifiy(Client client) {
        int rows = clientMapper.updateByPrimaryKey(client);
        System.out.println("====>"+rows);
        return rows;
    }

}
