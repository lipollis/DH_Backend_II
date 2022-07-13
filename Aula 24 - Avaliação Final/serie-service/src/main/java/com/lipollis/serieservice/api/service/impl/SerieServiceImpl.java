package com.lipollis.serieservice.api.service.impl;

import com.lipollis.serieservice.api.service.SerieService;
import com.lipollis.serieservice.domain.exception.SerieNotFoundException;
import com.lipollis.serieservice.domain.model.Serie;
import com.lipollis.serieservice.domain.repository.SerieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SerieServiceImpl implements SerieService {

	private final SerieRepository repository;

	public List<Serie> findByGenre(String genre) {
		return repository.findByGenre(genre);
	}

	@Override
	public Serie create(Serie serie) {
		return repository.save(serie);
	}

	@Override
	public List<Serie> getAll() {
		return repository.findAll();
	}

	@Override
	public Serie getById(Long id) {
		return repository.findById(id).orElseThrow( () -> new SerieNotFoundException(id));
	}

	@Override
	public void delete(Long id) {

	}
}
