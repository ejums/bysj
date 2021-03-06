package com.nicetest.user.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @author hjm09
 */
public class CookieUtil {
    public static final int COOKIE_MAX_AGE =  1800;
    public static final int COOKIE_HALF_HOUR = 30 * 60;


    private static Logger logger = LoggerFactory.getLogger(CookieUtil.class);

    private CookieUtil(){};

    public static HttpServletRequest getRequest(){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = null;
        if(requestAttributes != null) {
            request = requestAttributes.getRequest();
        }
        return request;
    }

    public static HttpServletResponse getResponse(){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletResponse response = null;
        if(requestAttributes != null) {
            response = requestAttributes.getResponse();
        }
        return response;
    }

    private static Cookie getCookie(String name){
        HttpServletRequest request = getRequest();
        if(request == null){
            logger.error( Marker.ANY_MARKER, "get HttpServletRequest failed");
            return null;
        }

        Cookie[]  cookies = request.getCookies();
        if(name == null || cookies == null || cookies.length ==0){
            return null;
        }
        for(Cookie cookie : cookies){
           if(cookie.getName().equals(name)){
               return cookie;
           }
        }
        return null;
    }

    public static String get(String name){
        Cookie cookie = getCookie(name);
        if(cookie != null){
            return cookie.getValue();
        }
        return null;
    }

    public static void remove(String name){
        if(name == null){
            return;
        }
        remove(getCookie(name));
    }

    private static void remove(Cookie cookie){
        if(cookie != null){
            cookie.setPath("/");
            cookie.setValue("");
            cookie.setMaxAge(0);
            getResponse().addCookie(cookie);
        }
    }

    public static void set(String name, String value, int maxValue) {
        if(name == null || "".equals(name)){
            return;
        }
        if(value == null){
            value = "";
        }
        try {
            Cookie cookie = new Cookie(name, URLEncoder.encode(value, "UTF-8"));
//            unescape
            cookie.setPath("/");
            String host = getRequest().getHeader("host");
            String domain = "localhost";
            if(host.contains(":")){
                domain = host.split(":")[0];
            }else{
                domain = host.split("/")[0];
            }
            cookie.setDomain(domain);
            cookie.setMaxAge(maxValue!=0?maxValue:COOKIE_HALF_HOUR);
            getResponse().addCookie(cookie);
            getResponse().flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void set(String name, String value){
        set(name,value,0);
    }

    public static void clear(){
        Cookie[]  cookies = getRequest().getCookies();
        for(Cookie cookie : cookies){
            remove(cookie);
        }
    }
}
