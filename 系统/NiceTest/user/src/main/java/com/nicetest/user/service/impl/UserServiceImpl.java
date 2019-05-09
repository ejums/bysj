package com.nicetest.user.service.impl;

import com.nicetest.user.dao.UserDao;
import com.nicetest.user.entity.User;
import com.nicetest.user.service.LoginRecordService;
import com.nicetest.user.service.UserService;
import com.nicetest.user.util.CookieUtil;
import com.nicetest.user.util.HttpResult;
import com.nicetest.user.util.JSONUtil;
import com.nicetest.user.util.MD5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hjm09
 */
@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);
    private final UserDao userDao;
    private final LoginRecordService loginRecordService;
    private final RedisTemplate<String, String> redisTemplate;

    @Autowired
    public UserServiceImpl(UserDao userDao, LoginRecordService loginRecordService, RedisTemplate<String, String> redisTemplate) {
        this.userDao = userDao;
        this.loginRecordService = loginRecordService;
        this.redisTemplate = redisTemplate;
    }

    @Override
    public HttpResult login(String username, String password, HttpServletRequest request) {
        User user = userDao.findByUsername(username);
        if(user == null){
            return HttpResult.send(202,"username not exists", null);
        }
        if(password.equals(user.getPassword())){
            loginRecordService.add(user.getId(), request);
            String ivh = user.toString()+ LocalDateTime.now();
            String data = MD5.md5(ivh);
            redisTemplate.opsForValue().set("token", data);
            redisTemplate.opsForValue().set(user.getUsername(), JSONUtil.stringify(user));
            CookieUtil.set("user", JSONUtil.stringify(user));
            CookieUtil.set("token", username+":"+request.getRemoteAddr());
            Map<String,Object> map = new HashMap<>();
            return HttpResult.send(JSONUtil.stringify(user));
        }else{
            return HttpResult.send(201,"username or password not matched", null);
        }
    }

    @Override
    public User find(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public int saveOrUpdate(User user) {
        return 0;
    }

    @Override
    public int remove(User user) {
        return 0;
    }
}
