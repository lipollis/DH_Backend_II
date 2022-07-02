package com.example.dhconta.service.impl;

import com.example.dhconta.service.ContaService;
import com.example.dhconta.service.UsuarioFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaServiceImpl implements ContaService {

    @Autowired
    private UsuarioFeign usuarioFeign;

    @Override
    public String getContaUsuario() {
        return "contaAux " + usuarioFeign.findUsuario();
    }
}
