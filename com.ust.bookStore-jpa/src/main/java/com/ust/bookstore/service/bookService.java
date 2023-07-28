package com.ust.bookstore.service;

import java.util.List;

import com.ust.bookstore.domain.book;

public interface bookService {
public book addBook(book books);
public book getBook(int id);
public book updateBook(book books);
public void deleteBook(int id);
public List<book> getAllBook();
}
