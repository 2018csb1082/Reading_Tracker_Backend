package com.booktracker.backend;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // No implementation needed – Spring Data provides everything!
}
