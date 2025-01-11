package com.example.bookstore.service;

import com.example.bookstore.model.Author;

import java.util.List;

public interface AuthorService {

    Author addAuthor(Author author);
    List<Author> getAllAuthor();
    Author getAuthorById(int id);
    Author updateAuthor(int id,Author author);
    void deleteAuthor(int myId);
}
