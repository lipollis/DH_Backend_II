package com.lipollis.serieservice.api.service;


import com.lipollis.serieservice.domain.model.Serie;

import java.util.List;

public interface SerieService {

    Serie create(Serie serie);
    List<Serie> getAll();
    Serie getById(Long id);
    void delete(Long id);
}
