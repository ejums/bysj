package com.nicetest.user.controller;

import com.nicetest.user.service.MenuService;
import com.nicetest.user.util.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hjm09
 */
@Controller
public class MenuController {
    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @ResponseBody
    @RequestMapping("/get_menu")
    public HttpResult menuList(){
        return HttpResult.send(menuService.list("hjm0928"));
    }
}
