package com.nicetest.user.service;

import com.nicetest.user.entity.User;
import com.nicetest.user.util.HttpResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hjm09
 */
public interface UserService {
    /**
     * check user login
     * @param username username
     * @param password password
     * @return is success
     */
    HttpResult login(String username, String password, HttpServletRequest request);


    /**'
     * find user by username
     * @param username username
     * @return user
     */
    User find(String username);

    /**
     * save user info
     * @param user user
     * @return change
     */
    int saveOrUpdate(User user);

    /**
     * remove user
     * @param user user
     * @return change
     */
    int remove(User user);
}
