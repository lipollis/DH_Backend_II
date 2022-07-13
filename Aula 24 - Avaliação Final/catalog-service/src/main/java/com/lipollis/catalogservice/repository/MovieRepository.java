package com.lipollis.catalogservice.repository;

import com.lipollis.catalogservice.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MovieRepository extends MongoRepository<Movie, Long> {
    List<Movie> findAllByName(String name);
}
