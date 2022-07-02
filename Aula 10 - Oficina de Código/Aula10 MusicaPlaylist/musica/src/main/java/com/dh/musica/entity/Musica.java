package com.dh.musica.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="musica")
@Data
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMusica;
    private String genero;
}
