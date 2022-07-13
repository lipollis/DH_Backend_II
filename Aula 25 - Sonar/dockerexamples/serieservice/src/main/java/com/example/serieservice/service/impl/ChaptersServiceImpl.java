package com.example.serieservice.service.impl;

import com.example.comum.service.impl.GenericEntityServiceImpl;
import com.example.serieservice.entity.Chapters;
import com.example.serieservice.repository.ChaptersRepository;
import com.example.serieservice.service.ChaptersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChaptersServiceImpl extends GenericEntityServiceImpl<Chapters> implements ChaptersService {

    @Autowired
    private ChaptersRepository repository;

    @Override
    protected ChaptersRepository getRepository() {
        return this.repository;
    }
}
