package com.example.ljn;


import com.baomidou.mybatisplus.core.mapper.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ServletComponentScan(basePackages = {"com.ctkj.cbsfback"})
@MapperScan(value = "com.example.ljn.dao")
//@MapperScan(value = {"com.example.ljn.*"})
//@ComponentScan(basePackages = {"com.example.ljn"})
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class LjnApplication {

    public static void main(String[] args) {
        SpringApplication.run(LjnApplication.class, args);
    }

}
