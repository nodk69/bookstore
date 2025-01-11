package com.example.bookstore.controller;

import com.example.bookstore.model.Book;
import com.example.bookstore.service.BookServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookServiceImplementation bookServiceImplementation;

    @PostMapping
    public Book addBook(@RequestBody Book book){
       return bookServiceImplementation.addBook(book);
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookServiceImplementation.getAllBook();
    }

    @GetMapping("id/{myId}")
    public Book getAuthorById(@PathVariable int myId){
        return bookServiceImplementation.getBookById(myId);
    }

    @PostMapping("/{id}")
    public Book updateBook(@PathVariable int id,@RequestBody Book book){
        return bookServiceImplementation.updateBook(id,book);
    }

    @DeleteMapping("id/{myId}")
    public boolean deleteAuthor(@PathVariable int myId){
        bookServiceImplementation.deleteBook(myId);
        return true;
    }
}
