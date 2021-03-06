package com.christianperez.LibaryManagment.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.christianperez.LibaryManagment.models.Book;
import com.christianperez.LibaryManagment.service.BookService;

@Controller
public class BookController {
	private final BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping("/home")
	public String findAllBooks(Model model) {
		final List<Book> books = bookService.findAllBooks();

		model.addAttribute("books", books);
		return "home.jsp";
	}

//	@RequestMapping("/booksearch")
//	public String searchBook(@Param("keyword") String keyword, Model model) {
//		final List<Book> books = bookService.searchBooks(keyword);
//
//		model.addAttribute("books", books);
//		model.addAttribute("keyword", keyword);
//		return "home.jsp";
//	}

	@RequestMapping("/addbook")
	public String addform(@ModelAttribute("book") Book book) {
		return "addForm.jsp";
	}

	@RequestMapping(value = "/addresults", method = RequestMethod.POST)
	public String fromResults(@ModelAttribute("book") Book book) {
		bookService.createBook(book);
		return "redirect:/home";
	}
	@RequestMapping("/removebook/{id}")
	public String deleteBook(@PathVariable("id") Long id, Model model) {
		bookService.deleteBook(id);

		model.addAttribute("book", bookService.findAllBooks());
		return "redirect:/books";
	}

}
