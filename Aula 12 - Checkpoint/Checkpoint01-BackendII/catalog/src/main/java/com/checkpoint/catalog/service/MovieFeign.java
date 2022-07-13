package com.checkpoint.catalog.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "MOVIE")
public interface MovieFeign {

    @RequestMapping(method = RequestMethod.GET,value = "movie/catalog/{genre}")
    List<Object> findByGenre(@PathVariable String genre);
}