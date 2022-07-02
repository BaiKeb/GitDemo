package com.example.ljn.controller;

import com.example.ljn.api.CommonResult;
import com.example.ljn.entity.Book;
import com.example.ljn.service.BookService;
import com.example.ljn.vo.BookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
//@CrossOrigin
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

//    @RequestMapping(value = "/bookList",method = RequestMethod.POST)
//    public List<Book> booklist(){
//        return bookService.findAll();
//    }

    @RequestMapping(value = "/bookList", method = RequestMethod.POST)
    public List<BookVO> querBook(BookVO vo){
        List<BookVO> list = bookService.querBook(vo);
        System.out.println("输出"+list);


        return list;
    }

    @RequestMapping(value = "/addbook", method = RequestMethod.POST)

    public int addbook(@RequestBody BookVO vo) {
        System.out.println("传入"+vo);
        return bookService.insertBook(vo);
    }

    @DeleteMapping("/deleteById/{id}")
    public int deleteById(@PathVariable("id") Long id) {
        Integer result = 0;
        result = bookService.deleteById(id);
        //删除成功则返回受影响的行数
        return result;
    }

    @GetMapping("/findById/{id}")
    public Book findById(@PathVariable("id") Long id) {
        return bookService.findById(id);
    }

    @PutMapping("/updateById")
    public int updateById(@RequestBody Book book) {
        //返回修改的条数
        return bookService.updateById(book);
    }

}
