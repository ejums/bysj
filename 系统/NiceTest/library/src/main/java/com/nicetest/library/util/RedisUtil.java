package com.nicetest.library.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.types.RedisClientInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hjm09
 */
@Component
public class RedisUtil {
    private static RedisTemplate<Object, Object> redisTemplate;

    @Autowired
    public RedisUtil(RedisTemplate<Object, Object> redisTemplate) {
        RedisUtil.redisTemplate = redisTemplate;
    }

    public static void put(String key, Object value, int timeout){
        redisTemplate.opsForValue().set(key, value, timeout);
    }

    public static void update(String key, Object value){
        redisTemplate.opsForValue().set(key, value, 3000000);
    }

    public static Object get(String key){
        return redisTemplate.opsForValue().get(key);
    }

    public static void remove(String key){
        redisTemplate.delete(key);
    }

    public static List<RedisClientInfo> getAll(){
       return  redisTemplate.getClientList();
    }
}
