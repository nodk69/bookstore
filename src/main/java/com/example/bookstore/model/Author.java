package com.example.bookstore.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Author_Table")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorId;
    private String authorName;
    private String address;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL,orphanRemoval = true,fetch =FetchType.EAGER)
    @JsonManagedReference
    private List<Book> books=new ArrayList<>();

    private void addBook(Book book){
        books.add(book);
    }

    private void removeBook(Book book){
        books.remove(book);
    }
}
