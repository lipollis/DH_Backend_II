package com.lipollis.catalogservice.service;

import com.lipollis.catalogservice.model.Movie;

import java.util.List;

public interface MovieService {
    void save(Movie movie);
    List<Movie> getByNome(String nome);
}
