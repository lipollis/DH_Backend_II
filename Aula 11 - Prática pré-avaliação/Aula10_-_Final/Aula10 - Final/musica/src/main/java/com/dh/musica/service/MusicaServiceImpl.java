package com.dh.musica.service;

import com.dh.musica.entity.Musica;
import com.dh.musica.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicaServiceImpl implements MusicaService{
    @Autowired
    private MusicaRepository repository;

    @Override
    public void save(Musica musica) {
        repository.save(musica);
    }

    @Override
    public String findByGenero(String genero) {
        return repository.findByGenero(genero).getNomeMusica();
    }
}
