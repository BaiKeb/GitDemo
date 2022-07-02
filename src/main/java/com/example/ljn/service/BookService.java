package com.example.ljn.service;

import com.example.ljn.entity.Book;
import com.example.ljn.vo.BookVO;

import java.util.List;
import java.util.Map;

public interface BookService {
    public List<Book> findAll();
    public Book findById(Long id);
    public int insert(Book book);
    public int deleteById(Long id);
    public int updateById(Book book);

    List<BookVO> querBook(BookVO vo);

    int insertBook(BookVO vo);

    int updatebook(BookVO vo);

    int deletebook (BookVO vo);


//    List<Book> querBook(Book book);
}
