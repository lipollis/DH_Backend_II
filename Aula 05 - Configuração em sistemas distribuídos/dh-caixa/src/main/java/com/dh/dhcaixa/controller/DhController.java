package com.dh.dhcaixa.controller;

import com.dh.dhcaixa.service.DhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/caixa")
public class DhController {

    @Autowired
    private DhService service;

    @PostMapping()
    private ResponseEntity<Void> setQtdeNotas(@RequestParam String aux) {
        service.setQtdeNotas(aux);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping()
    private ResponseEntity<String> qtdeSaldo(){
        return ResponseEntity.ok(service.getSaldo());
    }
}
