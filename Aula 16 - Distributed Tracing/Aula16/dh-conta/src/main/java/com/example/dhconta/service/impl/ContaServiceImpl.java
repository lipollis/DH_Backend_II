package com.example.dhconta.service.impl;

import com.example.dhconta.CircuitBreakerException;
import com.example.dhconta.service.ContaService;
import com.example.dhconta.service.UsuarioFeign;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaServiceImpl implements ContaService {

    @Autowired
    private UsuarioFeign usuarioFeign;

    @Override
    @CircuitBreaker(name="api-usuario", fallbackMethod = "getUsuarioFallbackValue")
    @Retry(name="api-usuario")
    public String getContaUsuario() {
        System.out.println("executando");
        return "contaAux " + usuarioFeign.findUsuario();
    }

    public String getUsuarioFallbackValue(CallNotPermittedException ex) throws CircuitBreakerException {
        throw new CircuitBreakerException("Circuit breaker was activated");
    }

}
