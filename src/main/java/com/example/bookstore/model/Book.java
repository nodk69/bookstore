package com.example.bookstore.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Book_Table")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String bookName;
    private int price;

    @ManyToOne
    @JoinColumn(name = "author_Id")
    @JsonBackReference
    private Author author; //creating an object of other entity (now Author primary key will become foreign key for Book)
}
