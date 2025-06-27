package com.booktracker.backend;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:5173")   // allow your React dev server
public class BookController {

    // In-memory “store” for demo purposes
    private final List<Map<String,String>> books = new ArrayList<>();

    // Initialize with two dummy books
    public BookController() {
        books.add(Map.of(
            "id", "1",
            "name", "Atomic Habits",
            "author", "James Clear",
            "genre", "Self-Help",
            "image", "https://covers.openlibrary.org/b/id/10594752-L.jpg"
        ));
        books.add(Map.of(
            "id", "2",
            "name", "Dune",
            "author", "Frank Herbert",
            "genre", "Science Fiction",
            "image", "https://covers.openlibrary.org/b/id/10318328-L.jpg"
        ));
    }

    // GET /api/books  → return all books
    @GetMapping
    public List<Map<String,String>> getAll() {
        return books;
    }

    // POST /api/books → accept a book JSON and echo it back (and add to list)
    @PostMapping
    public Map<String,String> addBook(@RequestBody Map<String,String> newBook) {
        // assign a simple incremental ID if absent
        if (!newBook.containsKey("id")) {
            newBook.put("id", String.valueOf(books.size() + 1));
        }
        books.add(newBook);
        return newBook;
    }

    // DELETE /api/books/{id} → remove by id
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
        books.removeIf(b -> b.get("id").equals(id));
    }
}
