package com.example.ljn.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ljn.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {
    List<User> querUser(User userExample);
}
