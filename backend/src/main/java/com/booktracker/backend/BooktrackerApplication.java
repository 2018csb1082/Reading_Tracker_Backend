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
				repository.save(new Book(
					"The Silent Patient",
					"Alex Michaelides",
					"Thriller",
					"https://covers.openlibrary.org/b/id/10594762-M.jpg",
					"Reading"
				));
				repository.save(new Book(
					"Atomic Habits",
					"James Clear",
					"Self-Help",
					"https://covers.openlibrary.org/b/id/10594752-M.jpg",
					"Reading"
				));
				repository.save(new Book(
					"Dune",
					"Frank Herbert",
					"Science Fiction",
					"https://covers.openlibrary.org/b/id/10958326-M.jpg",
					"Reading"
				));
				repository.save(new Book(
					"Becoming",
					"Michelle Obama",
					"Biography",
					"https://covers.openlibrary.org/b/id/9259256-M.jpg",
					"Reading"
				));
				repository.save(new Book(
					"Educated",
					"Tara Westover",
					"Memoir",
					"https://covers.openlibrary.org/b/id/8952766-M.jpg",
					"Wishlist"
				));
				repository.save(new Book(
					"The Midnight Library",
					"Matt Haig",
					"Fantasy",
					"https://covers.openlibrary.org/b/id/10629545-M.jpg",
					"Wishlist"
				));
				repository.save(new Book(
					"1984",
					"George Orwell",
					"Dystopian",
					"https://covers.openlibrary.org/b/id/7222246-M.jpg",
					"Wishlist"
				));
				repository.save(new Book(
					"The Alchemist",
					"Paulo Coelho",
					"Philosophical",
					"https://covers.openlibrary.org/b/id/8231856-M.jpg",
					"Wishlist"
				));
				repository.save(new Book(
					"Sapiens",
					"Yuval Noah Harari",
					"History",
					"https://covers.openlibrary.org/b/id/9262465-M.jpg",
					"Completed"
				));
				repository.save(new Book(
					"The Subtle Art of Not Giving a F*ck",
					"Mark Manson",
					"Self-Help",
					"https://covers.openlibrary.org/b/id/8370221-M.jpg",
					"Completed"
				));
				repository.save(new Book(
					"Where the Crawdads Sing",
					"Delia Owens",
					"Mystery",
					"https://covers.openlibrary.org/b/id/9354586-M.jpg",
					"Completed"
				));
				repository.save(new Book(
					"The Book Thief",
					"Markus Zusak",
					"Historical Fiction",
					"https://covers.openlibrary.org/b/id/8221251-M.jpg",
					"Completed"
				));
			};
	}

}
