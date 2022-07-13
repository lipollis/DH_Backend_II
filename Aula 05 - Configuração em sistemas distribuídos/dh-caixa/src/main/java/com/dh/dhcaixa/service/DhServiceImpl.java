package com.dh.dhcaixa.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
public class DhServiceImpl implements DhService {

    @Value("${notas}")
    private String notas;

    @Value("${moeda}")
    private String moeda;

    private HashMap<String, Integer> caixa;
    private Integer saldo;

    public DhServiceImpl() {
        this.caixa = new HashMap<>();
    }

    @Override
    public void setQtdeNotas(String aux) {
        List<String> qtd = Arrays.asList(aux.split(","));
        List<String> notasAux = Arrays.asList(notas.split(","));
        for (int i = 0; i < notasAux.size(); i++) {
            this.caixa.put(notasAux.get(i),Integer.parseInt(qtd.get(i)));
        }
    }

    @Override
    public String getSaldo() {
        this.saldo = 0;
        this.caixa.keySet().forEach(c ->{
            this.saldo += Integer.parseInt(c)*this.caixa.get(c);
        });
        return "o saldo na moeda " + moeda + " é de: " + saldo;
    }

}
