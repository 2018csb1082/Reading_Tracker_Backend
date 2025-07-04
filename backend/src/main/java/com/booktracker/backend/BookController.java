package com.booktracker.backend;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:5173")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // GET all books
    @GetMapping
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    // POST a new book
    @PostMapping
    public Book addBook(@RequestBody Book newBook) {
        return bookRepository.save(newBook);
    }

    // DELETE a book by ID
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }
}
