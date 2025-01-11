package com.example.bookstore.service;

import com.example.bookstore.model.Author;
import com.example.bookstore.model.Book;
import com.example.bookstore.repository.AuthorRepository;
import com.example.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplementation implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Book addBook(Book book) {
       return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public Book updateBook(int id,Book book){
        Book book1 = bookRepository.findById(id).orElse(null);
        if(book1!=null){
            book1.setBookName(book.getBookName());
            book1.setPrice(book.getPrice());
            return bookRepository.save(book);
        }
        return null;
    }

    @Override
    public void deleteBook(int myId) {
         bookRepository.deleteById(myId);
    }
}
