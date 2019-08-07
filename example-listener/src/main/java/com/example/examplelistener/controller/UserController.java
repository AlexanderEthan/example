package com.example.examplelistener.controller;

import com.example.examplelistener.po.UserBean;
import com.example.examplelistener.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    //用户业务逻辑实现
    @Autowired
    private IUserService userService;

    /**
     * 注册控制方法
     * @param user 用户对象
     * @return
     */
    @RequestMapping(value = "/register")
    @ResponseBody
    public String register(UserBean user) {
        //调用注册业务逻辑
        userService.register(user);
        userService.asnycTest();
        return "注册成功.";
    }
}
