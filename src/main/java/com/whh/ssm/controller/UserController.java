package com.whh.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.whh.ssm.model.User;
import com.whh.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/3/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static  final Logger logger =Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;
    @RequestMapping("/showUser")
    public String showUser(){
        User user =userService.getUserById("1");
        logger.info(JSON.toJSONString(user));
       return "showUser";
    }

}
