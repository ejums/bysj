package com.nicetest.user.service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hjm09
 */
public interface LoginRecordService {
    /**
     * add login record
     * @param userId userId
     * @param request request
     */
    void add(Integer userId, HttpServletRequest request);
}
