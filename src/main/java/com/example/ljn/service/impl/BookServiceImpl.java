package com.example.ljn.service.impl;

import com.example.ljn.dao.BookMapper;
import com.example.ljn.entity.Book;
import com.example.ljn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

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
    public List<Book> querBook(){
        List<Book> book1 = Collections.singletonList(bookMapper.querBook());
        System.out.println("book1="+book1);

        return book1;
    }

}
