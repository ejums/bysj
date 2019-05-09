package com.nicetest.user.service.impl;

import com.nicetest.user.dao.LoginRecordDao;
import com.nicetest.user.entity.LoginRecord;
import com.nicetest.user.service.LoginRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Service
public class LoginRecordServiceImpl implements LoginRecordService {

    private final LoginRecordDao loginRecordDao;

    @Autowired
    public LoginRecordServiceImpl(LoginRecordDao loginRecordDao) {
        this.loginRecordDao = loginRecordDao;
    }

    @Override
    public void add(Integer userId, HttpServletRequest request) {
        LoginRecord record = new LoginRecord();
        record.setUserId(userId);
        record.setLoginTime(LocalDateTime.now());
        record.setLoginIp(request.getRemoteAddr());
        loginRecordDao.save(record);
    }
}
