package com.checkpoint.movie.service;

import com.checkpoint.movie.entity.MovieEntity;

import java.util.List;

public interface MovieService {
    void save(MovieEntity movieEntity);
    List<MovieEntity> findByGenre(String genre);
}
