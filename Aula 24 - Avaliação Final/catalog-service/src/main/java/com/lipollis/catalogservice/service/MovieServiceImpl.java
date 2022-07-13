package com.lipollis.catalogservice.service;

import com.lipollis.catalogservice.model.Movie;
import com.lipollis.catalogservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository repository;


    @Override
    public void save(Movie movie) {
        repository.save(movie);
    }

    @Override
    public List<Movie> getByNome(String nome) {
        return repository.findAllByName(nome);
    }
}
