package com.lipollis.serieservice.api.controller;

import com.lipollis.serieservice.api.dto.SerieDto;
import com.lipollis.serieservice.api.service.impl.SerieServiceImpl;
import com.lipollis.serieservice.domain.model.Serie;
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
public class SerieController {


	private final SerieServiceImpl service;
	private final ModelMapper mapper;

	@GetMapping("/{genre}")
	ResponseEntity<List<Serie>> getMovieByGenre(@PathVariable String genre) {
		return ResponseEntity.ok().body(service.findByGenre(genre));
	}

	@PostMapping
	ResponseEntity<Serie> create(@RequestBody SerieDto serie) {
		return ResponseEntity.ok().body(service.create(
				mapper.map(serie, Serie.class)
		));
	}

	@GetMapping
	ResponseEntity<List<SerieDto>> getAll() {
		return ResponseEntity
				.ok()
				.body(
						service
								.getAll()
								.stream()
								.map(m -> mapper.map(m, SerieDto.class))
								.collect(Collectors.toList())
				);
	}
}
