package com.dh.biblioteca.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "JOGOS")
public interface JogosFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/jogos/biblioteca/{id}")
    String findNome(@PathVariable(value = "id") Long idBiblioteca);
}
