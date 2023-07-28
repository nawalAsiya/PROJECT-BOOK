package com.ust.bookstore.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ust.bookstore.domain.book;

@Repository
public interface bookRepo extends CrudRepository<book, Integer>{

}
