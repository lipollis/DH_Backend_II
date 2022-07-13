package com.example.dhconta.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name= "dh-usuario")
public interface UsuarioFeign {
    @RequestMapping(method = RequestMethod.GET,value = "/usuario")
    String findUsuario();
}
