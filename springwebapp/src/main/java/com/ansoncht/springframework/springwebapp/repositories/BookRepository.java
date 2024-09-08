package com.ansoncht.springframework.springwebapp.repositories;

import com.ansoncht.springframework.springwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {}
