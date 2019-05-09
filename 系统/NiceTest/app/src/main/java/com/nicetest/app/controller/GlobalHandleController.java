package com.nicetest.app.controller;

import com.nicetest.app.util.HttpResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hjm09
 */

@ControllerAdvice
@RestController
public class GlobalHandleController implements ErrorController {
    private static Logger logger = LoggerFactory.getLogger(GlobalHandleController.class);
    private final RedisTemplate<String, String> redisTemplate;

    @Autowired
    public GlobalHandleController(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }


    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(HttpServletRequest request, Exception exception) throws Exception  {
        exception.printStackTrace();
        return HttpResult.send(500, "server error", null);
    }

    @RequestMapping("/error")
    public void notFound(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println(HttpResult.send(404, "not found", null));
    }

    @RequestMapping("/s")
    public String exception(){
        int s = 1/0;
        return HttpResult.send(null);
    }

    @Override
    public String getErrorPath() {
        return "error";
    }
}
