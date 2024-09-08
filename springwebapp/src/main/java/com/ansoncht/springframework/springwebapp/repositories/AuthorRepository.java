package com.ansoncht.springframework.springwebapp.repositories;

import com.ansoncht.springframework.springwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {}
