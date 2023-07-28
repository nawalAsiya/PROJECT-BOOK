package com.ust.bookstore.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ust.bookstore.domain.book;
import com.ust.bookstore.service.bookService;
@RestController
@RequestMapping("/api/book")

public class bookController {
	@Autowired
 private bookService service;

	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	public book addBook( @Valid @RequestBody book books) {
		return service.addBook(books);
	}

    @GetMapping("/{id}")
    @ResponseStatus(code=HttpStatus.OK)
	public book getBook(@PathVariable @Valid int id) {
		return service.getBook(id);
		
	}

    @PutMapping
    @ResponseStatus(code=HttpStatus.ACCEPTED)
	public book updateBook( @Valid @RequestBody book books) {		
		return service.updateBook(books);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(code=HttpStatus.OK)
	public void deleteBook(@PathVariable @Valid int id) {		
		service.deleteBook(id);
	}

	@GetMapping
	@ResponseStatus(code=HttpStatus.OK)
	public List<book> getAllBook() {
		
		return (List<book>)service.getAllBook();
	}
	
 
 
}
