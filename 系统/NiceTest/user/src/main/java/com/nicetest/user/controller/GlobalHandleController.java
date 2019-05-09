package com.nicetest.user.controller;

import com.nicetest.user.util.HttpResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hjm09
 */

@Controller
@ControllerAdvice
public class GlobalHandleController implements ErrorController {
    private static Logger logger = LoggerFactory.getLogger(GlobalHandleController.class);
    private final RedisTemplate<String, String> redisTemplate;

    @Autowired
    public GlobalHandleController(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }


    @RequestMapping("/error")
    @ResponseBody
    public HttpResult notFound(HttpServletRequest request, HttpServletResponse response){
        return HttpResult.send(404, "not found", null);
    }

    @Override
    public String getErrorPath() {
        return "error";
    }

}
