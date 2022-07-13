package com.example.dhconta.service;

import com.example.dhconta.conf.LoadBalancerConfiguration;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name= "api-usuario")
@LoadBalancerClient(name = "api-usuario",configuration= LoadBalancerConfiguration.class)
public interface UsuarioFeign {
    @RequestMapping(method = RequestMethod.GET,value = "/usuario")
    String findUsuario();
}
