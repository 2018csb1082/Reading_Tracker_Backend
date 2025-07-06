package com.booktracker.backend;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

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

    // GET books by status
    @GetMapping("/status")
    public List<Book> getByStatus(@RequestParam("value") String status) {
        return bookRepository.findByStatus(status);
    }

    // POST a new book
    @PostMapping
    public Book addBook(@RequestBody Book newBook) {
        return bookRepository.save(newBook);
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<Book> updateBookStatus(
            @PathVariable Long id,
            @RequestParam String status) {

        Optional<Book> optionalBook = bookRepository.findById(id);
        if (!optionalBook.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Book book = optionalBook.get();
        book.setStatus(status);
        Book updatedBook = bookRepository.save(book);

        return ResponseEntity.ok(updatedBook);
    }

    // DELETE a book by ID
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }
}
