package com.dh.musica.service;

import com.dh.musica.entity.Musica;

public interface MusicaService {
    void save(Musica musica);
    String findByGenero(String genero);
}
