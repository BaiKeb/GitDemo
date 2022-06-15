package com.example.ljn.service.impl;

import com.example.ljn.dao.UserMapper;
import com.example.ljn.entity.User;
import com.example.ljn.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User login(User vo) {
        User userExample = new User();
        userExample.setUsername(vo.getUsername());
        userExample.setPassword(vo.getPassword());
        List<User> userList = userMapper.querUser(userExample);
        if (userList == null || userList.size() == 0) {
            return null;
        }
        if (userList.size() > 1) {
            throw new RuntimeException(String.format("找到多个用户，userName[%s]", vo.getUsername()));
        }
        return vo;
    }
}
