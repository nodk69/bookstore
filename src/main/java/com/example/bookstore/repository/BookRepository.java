package com.example.bookstore.repository;

import com.example.bookstore.DTO.BookDTO;
import com.example.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

//    @Query("SELECT new com.example.BookDTO(b.bookName, b.price, a.name) " +
//            "FROM Book b JOIN b.author a")
//    List<BookDTO> findAllBooksWithAuthors();

}
