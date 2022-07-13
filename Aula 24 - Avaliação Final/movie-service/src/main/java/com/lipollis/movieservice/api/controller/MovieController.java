package com.lipollis.movieservice.api.controller;

import com.lipollis.movieservice.api.dto.MovieDto;
import com.lipollis.movieservice.api.service.impl.MovieServiceImpl;
import com.lipollis.movieservice.domain.model.Movie;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RefreshScope
@RestController
@AllArgsConstructor
public class MovieController {


	private final MovieServiceImpl service;
	private final ModelMapper mapper;

	@GetMapping("/{genre}")
	ResponseEntity<List<Movie>> getMovieByGenre(@PathVariable String genre) {
		return ResponseEntity.ok().body(service.findByGenre(genre));
	}

	@PostMapping
	ResponseEntity<Movie> create(@RequestBody MovieDto movie) {
		return ResponseEntity.ok().body(service.create(
				mapper.map(movie, Movie.class)
		));
	}

	@GetMapping
	ResponseEntity<List<MovieDto>> getAll() {
		return ResponseEntity
				.ok()
				.body(
						service
								.getAll()
								.stream()
								.map(m -> mapper.map(m, MovieDto.class))
								.collect(Collectors.toList())
				);
	}
}
