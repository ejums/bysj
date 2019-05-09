package com.nicetest.user.service;

import java.util.List;

public interface MenuService {
    /**
     * 根据用户生成菜单
     * @param username 用户名
     * @return json data
     */
    List list(String username);
}
