package com.example.bookstore.service;

import com.example.bookstore.model.Book;

import java.util.List;

public interface BookService  {

    Book addBook(Book book);
    List<Book> getAllBook();
    Book getBookById(int id);
    Book updateBook(int id,Book book);
    void deleteBook(int myId);
}
