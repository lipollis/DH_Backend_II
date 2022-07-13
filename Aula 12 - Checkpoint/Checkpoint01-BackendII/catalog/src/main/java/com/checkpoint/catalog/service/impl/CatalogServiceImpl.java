package com.checkpoint.catalog.service.impl;

import com.checkpoint.catalog.service.CatalogService;
import com.checkpoint.catalog.service.MovieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private MovieFeign movieFeign;

    @Override
    public List<Object> getByGenre(String genre) {
        return movieFeign.findByGenre(genre);
    }
}
