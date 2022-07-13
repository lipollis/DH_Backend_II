package com.example.serieservice.service.impl;

import com.example.comum.service.impl.GenericEntityServiceImpl;
import com.example.serieservice.entity.Seasons;
import com.example.serieservice.repository.SeasonsRepository;
import com.example.serieservice.service.SeasonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeasonsServiceImpl extends GenericEntityServiceImpl<Seasons> implements SeasonsService {

    @Autowired
    private SeasonsRepository repository;

    @Override
    protected SeasonsRepository getRepository() {
        return this.repository;
    }
}
