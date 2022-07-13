package com.example.serieservice.resource;

import com.example.serieservice.entity.Seasons;
import com.example.serieservice.service.SeasonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/seasons")
@RestController
public class SeasonsResource extends GenericEntityResource<Seasons>{

    @Autowired
    private SeasonsService service;

    @Override
    protected SeasonsService getService() {
        return this.service;
    }
}
