package com.example.ljn.service;

import com.example.ljn.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> findAll();
    public Book findById(Long id);
    public int insert(Book book);
    public int deleteById(Long id);
    public int updateById(Book book);

    List<Book> querBook();

//    List<Book> querBook(Book book);
}
