package com.nicetest.user.util;

import java.util.HashMap;

/**
 * @author hjm09
 */
public class HttpResult {

    private int code;
    private String msg;
    private Object data;

    private HttpResult(){}

    public static HttpResult send(Object data){
        return send(200, "success", data);
    }

    public static HttpResult send(String msg, Object data){
        return send(200, msg, data);
    }

    public static HttpResult send(Integer code, String msg, Object data){
        HttpResult result = new HttpResult();
        result.setCode(code);
        result.setMsg(msg);

        if(!(data instanceof String)){
            result.setData(data);
        }else{
            String data_ = ((String)data).trim();
            boolean isJson = (data_.startsWith("{") && data_.endsWith("}") )
                    || (data_.startsWith("[") && data_.endsWith("]"));
            if(isJson){
                result.setData(JSONUtil.parserMap((String)data));
            }
            result.setData(data);
        }
        return result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
