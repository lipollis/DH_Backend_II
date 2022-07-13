package com.dh.playlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaylistServiceImpl implements  PlaylistService {

    @Autowired
    private MusicaFeign musica;

    @Override
    public String getMusica(String genero) {
        return musica.findMusica(genero);
    }
}
