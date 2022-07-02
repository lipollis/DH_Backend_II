package com.example.dhconta.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ContaDTO implements Serializable {
    private Long id;
    private String descricao;
    private String nomeUsuario;
    private Long idUsuario;
}
