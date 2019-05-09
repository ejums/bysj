package com.nicetest.user.controller;

import com.nicetest.user.service.UserService;
import com.nicetest.user.util.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hjm09
 */
@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService, RedisTemplate<String, String> redisTemplate) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    @ResponseBody
    public HttpResult login(String username, String password, HttpServletRequest request){
        return userService.login(username, password, request);
    }
}
