package com.nicetest.library.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author hjm09
 */
public class UserManager {
    private static Logger logger = LoggerFactory.getLogger(UserManager.class);
    private UserManager(){};

    public static Map currentUser(){
        return JSONUtil.parserObject(CookieUtil.get("user"), Map.class);
    }
}
