package com.dh.musica.controller;

import com.dh.musica.entity.Musica;
import com.dh.musica.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/musica")
public class MusicaController {

    @Autowired
    private MusicaService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Musica musica){
        service.save(musica);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/{genero}")
    public String find(@PathVariable String genero){
        return service.findByGenero(genero);
    }
}
