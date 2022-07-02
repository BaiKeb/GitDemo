package com.example.ljn.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ljn.entity.Book;
import com.example.ljn.vo.BookVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

//@Repository
@Mapper
public interface BookMapper extends BaseMapper<Book> {

    List<BookVO> querBook(BookVO vo);

    int insertBook(BookVO vo);

    int updatebook(BookVO vo);

    int deletebook(BookVO vo);
}
