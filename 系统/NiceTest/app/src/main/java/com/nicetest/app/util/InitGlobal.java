package com.nicetest.app.util;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Map;

/**
 * @author hjm09
 */
@Configuration
public class InitGlobal implements ApplicationRunner {

    private static Logger logger = LoggerFactory.getLogger(InitGlobal.class);
    private final ZuulProperties properties;
    private final RedisTemplate<String, String> redisTemplate;

    @Autowired
    public InitGlobal(ZuulProperties properties, RedisTemplate<String, String> redisTemplate) {

        this.properties = properties;
        this.redisTemplate = redisTemplate;

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("initializing global to redis");
        Map<String, ZuulProperties.ZuulRoute> routes = properties.getRoutes();
        redisTemplate.opsForValue().set("routes", JSONObject.toJSONString(routes.values()));
        logger.info("initialized global success");
    }
}
