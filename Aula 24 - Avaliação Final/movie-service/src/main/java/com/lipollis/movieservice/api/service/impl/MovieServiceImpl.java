package com.lipollis.movieservice.api.service.impl;

import com.lipollis.movieservice.api.service.MovieService;
import com.lipollis.movieservice.domain.exception.MovieNotFoundException;
import com.lipollis.movieservice.domain.model.Movie;
import com.lipollis.movieservice.domain.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MovieServiceImpl implements MovieService {

	private final MovieRepository repository;

	public List<Movie> findByGenre(String genre) {
		return repository.findByGenre(genre);
	}

	@Override
	public Movie create(Movie movie) {
		return repository.save(movie);
	}

	@Override
	public List<Movie> getAll() {
		return repository.findAll();
	}

	@Override
	public Movie getById(Long id) {
		return repository.findById(id).orElseThrow( () -> new MovieNotFoundException(id));
	}

	@Override
	public void delete(Long id) {

	}
}
