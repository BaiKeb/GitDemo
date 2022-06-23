package com.example.ljn.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ljn.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Repository
@Mapper
public interface BookMapper extends BaseMapper<Book> {

    Book querBook();
}
