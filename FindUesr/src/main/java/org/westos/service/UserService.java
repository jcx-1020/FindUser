package org.westos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.westos.entity.User;
import org.westos.mapper.UserMapper;

import java.util.List;

public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void biz(){
        userMapper.findAll();
    }
}
