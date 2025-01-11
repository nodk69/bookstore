package com.example.bookstore.service;

import com.example.bookstore.model.Author;
import com.example.bookstore.model.Book;
import com.example.bookstore.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImplementation implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Author addAuthor(Author author) {

        return authorRepository.save(author);
    }

    @Override
    public List<Author> getAllAuthor() {

        return authorRepository.findAll();
    }

    @Override
    public Author getAuthorById(int id) {
        return authorRepository.findById(id).orElse(null);
    }

    @Override
    public Author updateAuthor(int id, Author author){
        Author author1= authorRepository.findById(id).orElse(null);
        if(author1!=null){
            author1.setAuthorName(author.getAuthorName());
            author1.setAddress(author.getAddress());
            return authorRepository.save(author);
        }
        return null;
    }

    @Override
    public void deleteAuthor(int myId) {
        authorRepository.deleteById(myId);
    }
}