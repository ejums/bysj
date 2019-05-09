package com.nicetest.library.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author hjm09
 */
@Component
public class JSONUtil {

    private static ObjectMapper objectMapper;

    @Autowired
    public JSONUtil(ObjectMapper objectMapper) {
        JSONUtil.objectMapper = objectMapper;
    }

    public static String stringify(Object obj){
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "json parser error";
    }

    public static <T> T parserObject(String str, Class<T> objClass) {
        try {
            return objectMapper.readValue(str, objClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T parserObject(String str, TypeReference<T> typeReference) {
        try {
            return objectMapper.readValue(str, typeReference);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> List<T> parserList(String str, Class<T> clazz){
        return parserObject(str, new TypeReference<List<T>>(){});
    }

    public static Map<String,Object> parserMap(String str){
        return parserObject(str, new TypeReference<Map<String,Object>>(){});
    }
}
