package com.nicetest.app.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;

/**
 * @author hjm09
 */
public class HttpResult {
    public static String send(Object data){
        return send(200, "success", data);
    }

    public static String send(String msg, Object data){
        return send(200, msg, data);
    }

    public static String send(Integer code, String msg, Object data){
        HashMap<String,Object> map = new HashMap<>();
        map.put("code", code);
        map.put("msg", msg);
        map.put("data", data);
        try {
            return new ObjectMapper().writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "json error";
    }

}
