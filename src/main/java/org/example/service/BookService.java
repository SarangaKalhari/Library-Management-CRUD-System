package org.example.service;

import org.example.model.entity.Book;
import org.example.repository.BookRepository;

public class BookService {

    BookRepository bookRepository = new BookRepository();

    public void addBook(Book book){
        bookRepository.addBook(book);
    }

    public void updateBook(Book book){
        bookRepository.updateBook(book);
    }

    public void deleteBook(String id){
        bookRepository.deleteBook(id);
    }

    public Book searchBook(String id){
        return bookRepository.searchBook(id);
    }
}
