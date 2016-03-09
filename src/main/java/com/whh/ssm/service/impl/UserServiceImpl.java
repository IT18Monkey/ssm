package com.whh.ssm.service.impl;

import com.whh.ssm.dao.UserMapper;
import com.whh.ssm.model.User;
import com.whh.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/3/9.
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;
    public User getUserById(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
