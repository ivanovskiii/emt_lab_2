package com.example.emt_lab2.model;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @ManyToOne
    Category category;

    @ManyToOne
    Author author;

    Integer availableCopies;
}
