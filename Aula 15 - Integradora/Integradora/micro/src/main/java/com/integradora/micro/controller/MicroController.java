package com.integradora.micro.controller;

import com.integradora.micro.service.MicroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/micro")
public class MicroController {

    @Autowired
    private MicroService service;

    @GetMapping
    public ResponseEntity<String> getUsuarios(){
//        ResponseEntity.status(HttpStatus.CREATED).build(); //Para qdo se cria uma requisição no banco
        return ResponseEntity.ok(service.getUsuarios());
    }
}
