package com.checkpoint.movie.controller;

import com.checkpoint.movie.entity.MovieEntity;
import com.checkpoint.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {

    @Autowired
    private MovieService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody MovieEntity movieEntity){
        service.save(movieEntity);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/catalog/{genre}")
    public List<MovieEntity> findByGenre(@PathVariable String genre){
        return service.findByGenre(genre);
    }
}
