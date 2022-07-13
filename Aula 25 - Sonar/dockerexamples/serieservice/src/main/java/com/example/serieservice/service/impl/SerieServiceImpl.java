package com.example.serieservice.service.impl;

import com.example.comum.service.impl.GenericEntityServiceImpl;
import com.example.serieservice.entity.Serie;
import com.example.serieservice.repository.SerieRepository;
import com.example.serieservice.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerieServiceImpl extends GenericEntityServiceImpl<Serie> implements SerieService {

    @Autowired
    private SerieRepository repository;

    @Override
    protected SerieRepository getRepository() {
        return this.repository;
    }
}
