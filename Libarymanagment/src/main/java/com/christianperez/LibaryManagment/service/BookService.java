package com.christianperez.LibaryManagment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.christianperez.LibaryManagment.models.Book;
import com.christianperez.LibaryManagment.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepo;

	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}

	// returns all
	public List<Book> findAllBooks() {
		return bookRepo.findAll();
	}

	// retrieves
	public Book findBook(Long id) {
		return this.bookRepo.findById(id).orElse(null);
	}
	
	public List<Book> searchBooks(String keyword) {
		if (keyword != null) {
			return bookRepo.search(keyword);
		}
		return bookRepo.findAll();
	}

	// Updates
	public Book updateBook(Book B) {
		return bookRepo.save(B);
	}

	// Deletes
	public void deleteBook(long id) {
		bookRepo.deleteById(id);
	}

}
