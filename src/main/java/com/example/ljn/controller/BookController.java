package com.example.ljn.controller;

import com.example.ljn.api.CommonResult;
import com.example.ljn.entity.Book;
import com.example.ljn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<Book> querBook(){
        List<Book> list = bookService.querBook();
//        book1 = bookService.querBook();
        System.out.println("输出"+list);
        return list;
    }

    @RequestMapping("/addbook")

    public int addbook(@RequestBody Book book) {
        return bookService.insert(book);
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
