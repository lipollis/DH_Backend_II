package com.checkpoint.movie.service.impl;

import com.checkpoint.movie.entity.MovieEntity;
import com.checkpoint.movie.repository.MovieRepository;
import com.checkpoint.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository repository;

    @Override
    public void save(MovieEntity movieEntity){
        repository.save(movieEntity);
    }

    @Override
    public List<MovieEntity> findByGenre(String genre) {
        return repository.findByGenre(genre);
    }


}
