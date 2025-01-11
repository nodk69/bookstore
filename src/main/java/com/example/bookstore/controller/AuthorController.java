package com.example.bookstore.controller;

import com.example.bookstore.model.Author;
import com.example.bookstore.model.Book;
import com.example.bookstore.service.AuthorServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    AuthorServiceImplementation authorServiceImplementation;

    @PostMapping
    public Author addAuthor(@RequestBody Author author){
        return authorServiceImplementation.addAuthor(author);
    }

    @GetMapping
    public List<Author> getAllAuthor(){
        return authorServiceImplementation.getAllAuthor();
    }

    @GetMapping("id/{myId}")
    public Author getAuthorById(@PathVariable int myId){
        return authorServiceImplementation.getAuthorById(myId);
    }

    @PostMapping("/{id}")
    public Author updateBook(@PathVariable int id, @RequestBody Author author){
        return authorServiceImplementation.updateAuthor(id,author);
    }

    @DeleteMapping("id/{myId}")
    public boolean deleteAuthor(@PathVariable int myId){
        authorServiceImplementation.deleteAuthor(myId);
        return true;
    }
}

