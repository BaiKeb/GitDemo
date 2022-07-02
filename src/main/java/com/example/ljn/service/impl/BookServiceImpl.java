package com.example.ljn.service.impl;

import com.example.ljn.dao.BookMapper;
import com.example.ljn.entity.Book;
import com.example.ljn.service.BookService;
import com.example.ljn.vo.BookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;


    @Override
    public List<Book> findAll() {
        return bookMapper.selectList(null);
    }

    @Override
    public Book findById(Long id) {
        return bookMapper.selectById(id);
    }

    @Override
    public int insert(Book book) {
        return bookMapper.insert(book);
    }

    @Override
    public int deleteById(Long id) {
        return bookMapper.deleteById(id);
    }

    @Override
    public int updateById(Book book) {
        return bookMapper.updateById(book);
    }

    @Override
    public List<BookVO> querBook(BookVO vo) {
        List<BookVO> book1 = bookMapper.querBook(vo);
        System.out.println("book1=" + book1);

        return book1;

    }

    @Override
    public int insertBook(BookVO vo) {
        vo.setCreateTime(new Date());
        return bookMapper.insertBook(vo);
    }

}
