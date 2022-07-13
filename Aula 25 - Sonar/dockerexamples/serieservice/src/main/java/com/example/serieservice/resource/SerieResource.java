package com.example.serieservice.resource;

import com.example.serieservice.entity.Serie;
import com.example.serieservice.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/serie")
@RestController
public class SerieResource  extends GenericEntityResource<Serie>{

    @Autowired
    private SerieService service;

    @Override
    protected SerieService getService() {
        return this.service;
    }
}
