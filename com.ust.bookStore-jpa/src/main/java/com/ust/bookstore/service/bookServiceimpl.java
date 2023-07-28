package com.ust.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.bookstore.domain.book;
import com.ust.bookstore.repository.bookRepo;
@Service
public class bookServiceimpl implements bookService {
	@Autowired
      private bookRepo repo;
	@Override
	public book addBook(book books) {
		
		return repo.save(books);
	}

	@Override
	public book getBook(int id) {
		return repo.findById(id).get();
		
	}

	@Override
	public book updateBook(book books) {
		
		return repo.save(books);
	}

	@Override
	public void deleteBook(int id) {
		
		repo.deleteById(id);
	}

	@Override
	public List<book> getAllBook() {
		
		return (List<book>)repo.findAll();
	}

}
