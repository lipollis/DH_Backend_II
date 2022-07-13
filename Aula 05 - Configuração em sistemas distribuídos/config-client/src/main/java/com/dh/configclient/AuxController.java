package com.dh.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/weather")
@RestController
public class AuxController {
    @Value("${message}")
    private String message;

    @GetMapping()
    public String getAux(){
        return message;//weatherService.getTemperature(city,country);
    }
}
