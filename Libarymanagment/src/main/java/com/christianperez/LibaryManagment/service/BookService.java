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
	
	//Creates book
	public Book createBook(Book B) {
		return bookRepo.save(B);
	}
	// returns all
	public List<Book> findAllBooks() {
		return bookRepo.findAll();
	}

	// retrieves
	public Book findBook(Long id) {
		return this.bookRepo.findById(id).orElse(null);
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
