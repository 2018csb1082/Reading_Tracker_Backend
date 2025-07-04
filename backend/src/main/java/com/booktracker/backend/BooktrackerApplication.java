package com.booktracker.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BooktrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooktrackerApplication.class, args);
	}

	@Bean
	CommandLineRunner seedDatabase(BookRepository repository) {
			return args -> {
					repository.save(new Book("Atomic Habits", "James Clear", "Self-Help", "https://covers.openlibrary.org/b/id/10594752-L.jpg"));
					repository.save(new Book("Dune", "Frank Herbert", "Science Fiction", "https://covers.openlibrary.org/b/id/10318328-L.jpg"));
			};
	}

}
