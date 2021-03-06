package com.lipollis.catalogservice;

import com.lipollis.catalogservice.model.Movie;
import com.lipollis.catalogservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping("/{nome}")
    private List<Movie> getByNome(@PathVariable String nome) {
        return service.getByNome(nome);
    }

    @PostMapping
    private ResponseEntity<Void> save(@RequestBody Movie movie){
        service.save(movie);
        return ResponseEntity.noContent().build();
    }
}
