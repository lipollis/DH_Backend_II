package com.integradora.micro.service;

import org.springframework.stereotype.Service;

@Service
public class MicroServiceImpl implements MicroService {

    @Override
    public String getUsuarios() {
        return "Tulio, Dayane, Fernando";
    }
}
