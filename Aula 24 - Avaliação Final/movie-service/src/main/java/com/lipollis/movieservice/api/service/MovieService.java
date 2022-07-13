package com.lipollis.movieservice.api.service;


import com.lipollis.movieservice.domain.model.Movie;

import java.util.List;

public interface MovieService {

    Movie create(Movie movie);
    List<Movie> getAll();
    Movie getById(Long id);
    void delete(Long id);
}
