package com.example.dhusuario.service;

import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Override
    public String getUsuario() {
        return "Usuario modulo dh-usuario";
    }
}
