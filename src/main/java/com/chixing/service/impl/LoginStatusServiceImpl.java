package com.chixing.service.impl;

import com.chixing.entity.LoginStatus;
import com.chixing.mapper.LoginStatusMapper;
import com.chixing.service.LoginStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginStatusServiceImpl implements LoginStatusService {

    @Autowired
    private LoginStatusMapper loginStatusMapper;

    @Override
    public LoginStatus queryLoginStatusById(Integer loginStatusId) {
        LoginStatus loginStatus = loginStatusMapper.selectByPrimaryKey(loginStatusId);
        return loginStatus;
    }

    @Override
    public int save(LoginStatus loginStatus) {
        int rows = loginStatusMapper.insert(loginStatus);
        return rows;
    }

    @Override
    public int remove(Integer loginStatusId) {
        int rows = loginStatusMapper.deleteByPrimaryKey(loginStatusId);
        return rows;
    }

    @Override
    public int modifiy(LoginStatus loginStatus) {
        int rows = loginStatusMapper.updateByPrimaryKey(loginStatus);
        return rows;
    }
}
