package com.dh.playlist.controller;

import com.dh.playlist.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {

    @Autowired
    private PlaylistService service;

    @GetMapping("/{genero}")
    public String findMusica(@PathVariable String genero){
        return service.getMusica(genero);
    }
}
