package com.qxx.login.controller;

import com.qxx.login.entity.User;
import com.qxx.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qxx
 * @create 2017-08-25 11:18
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public String addUser(User user){
        int a = userService.addUser(user);
        if(a==1){
            return "添加成功！";
        }
        return "添加失败！";
    }
}
