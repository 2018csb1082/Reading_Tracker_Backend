package com.booktracker.backend;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremented ID
    private Long id;

    private String name;
    private String author;
    private String genre;
    private String image;
    private String status;

    // Required by JPA
    public Book() {}

    public Book(String name, String author, String genre, String image, String status) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.image = image;
        this.status = status;
    }

    // Getters and setters (can generate via IDE)
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) { this.author = author; }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) { this.genre = genre; }

    public String getImage() {
        return image;
    }
    public void setImage(String image) { this.image = image; }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) { this.status = status; }
}
