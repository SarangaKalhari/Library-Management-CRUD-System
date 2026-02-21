package org.example.controller;

import org.example.model.entity.Book;
import org.example.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    BookService bookService = new BookService();

    @GetMapping
    public String hello(){
        return "Hello";
    }

    @PostMapping("/add")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @PostMapping("/update")
    public void updateBook(@RequestBody Book book){
        bookService.updateBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable String id){
        bookService.deleteBook(id);
    }

    @GetMapping("/search/{bookId}")
    public Book searchBook(@PathVariable String bookId){
        return bookService.searchBook(bookId);
    }


}
