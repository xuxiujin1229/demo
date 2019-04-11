package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //查询全部
    @RequestMapping("/selectAllUser")
    public String selectAllUser(Map map) {

        //调用service层查询全部的方法
        List<User> userList = userService.selectAllUser();
        map.put("userList",userList);

        return "index";
    }

}
