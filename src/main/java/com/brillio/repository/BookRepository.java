package com.brillio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.brillio.model.Book;

public interface BookRepository extends MongoRepository<Book,Integer> {

}
