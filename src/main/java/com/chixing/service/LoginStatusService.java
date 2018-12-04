package com.chixing.service;

import com.chixing.entity.LoginStatus;
import org.springframework.stereotype.Service;

@Service
public interface LoginStatusService {

    LoginStatus queryLoginStatusById(Integer loginStatusId);

    int save(LoginStatus loginStatus);

    int remove(Integer loginStatusId);

    int modifiy(LoginStatus loginStatus);
}
