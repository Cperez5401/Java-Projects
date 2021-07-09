package com.christianperez.LibaryManagment.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.christianperez.LibaryManagment.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findAll();
	
	public List<Book> search(String keyword);

	List<Book> findByAuthorContaining(String search);

	Optional<Book> findById(Long id);

	void deleteById(Long id);

}
