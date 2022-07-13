package com.example.serieservice.resource;

import com.example.serieservice.entity.Chapters;
import com.example.serieservice.service.ChaptersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/chapters")
@RestController
public class ChaptersResource extends GenericEntityResource<Chapters>{

    @Autowired
    private ChaptersService service;

    @Override
    protected ChaptersService getService() {
        return this.service;
    }
}
