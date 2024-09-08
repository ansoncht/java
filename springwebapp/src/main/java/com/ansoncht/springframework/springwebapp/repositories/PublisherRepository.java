package com.ansoncht.springframework.springwebapp.repositories;

import com.ansoncht.springframework.springwebapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {}
