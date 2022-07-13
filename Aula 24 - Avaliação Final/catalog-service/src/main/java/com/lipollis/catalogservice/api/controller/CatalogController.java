package com.lipollis.catalogservice.api.controller;

import com.lipollis.catalogservice.api.client.MovieServiceClient;
import com.lipollis.catalogservice.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatalogController {

	@Autowired
	MovieServiceClient serviceClient;

	@GetMapping("/{genre}")
	ResponseEntity<List<Movie>> getGenre(@PathVariable String genre) {
		return serviceClient.getMovieByGenre(genre);
	}

	@PostMapping ("/salvar")
	ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
		return serviceClient.saveMovie(movie);
	}
}
