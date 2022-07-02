package com.example.dhconta;

public class CircuitBreakerException extends Exception {

    public CircuitBreakerException(String mensagem){
        super(mensagem);
    }

}
