package com.nicetest.library.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author CQY13 MD5加密工具类
 */
public class MD5 {

    /**
     * 获取MD5加密
     * @param ivh 需要加密的字符串
     * @return String字符串 加密后的字符串
     */
    public static String md5(String ivh) {
        try {
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] bs = digest.digest(ivh.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : bs) {
                int temp = b & 255;
                if (temp < 16) {
                    // 手动补上一个“0”
                    hexString.append("0").append(Integer.toHexString(temp));
                } else {
                    hexString.append(Integer.toHexString(temp));
                }
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
