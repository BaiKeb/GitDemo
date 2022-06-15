package com.example.ljn;

import com.example.ljn.dao.UserMapper;
import com.example.ljn.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import javax.sound.midi.Soundbank;
import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class LjnApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
        System.out.println("获取成功："+dataSource.getConnection());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

}
