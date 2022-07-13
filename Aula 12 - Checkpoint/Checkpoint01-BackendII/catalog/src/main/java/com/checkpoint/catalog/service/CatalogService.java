package com.checkpoint.catalog.service;

import org.springframework.stereotype.Service;

import java.util.List;

public interface CatalogService{

    List<Object> getByGenre(String genre);
}
