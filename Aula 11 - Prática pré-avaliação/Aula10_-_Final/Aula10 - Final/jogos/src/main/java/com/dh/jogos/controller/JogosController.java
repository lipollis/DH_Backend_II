package com.dh.jogos.controller;

import com.dh.jogos.dto.JogosDTO;
import com.dh.jogos.service.JogosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogos")
public class JogosController {

    @Autowired
    private JogosService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody JogosDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/biblioteca/{id}")
    public String findByBibliotecaId(@PathVariable(value = "id") Long idBibliotaca) {
        return service.findJogoByBibliotecaId(idBibliotaca);
    }
}
