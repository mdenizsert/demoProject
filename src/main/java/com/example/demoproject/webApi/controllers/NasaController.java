package com.example.demoproject.webApi.controllers;

import com.example.demoproject.business.abstracts.DailyNasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Nasa")
public class NasaController {

    private DailyNasaService dailyNasaService;

    public NasaController(DailyNasaService dailyNasaService) {
        this.dailyNasaService = dailyNasaService;
    }



    @GetMapping("/get")
    public List<Object> getDailyNasa() {
        return dailyNasaService.getDailyNasa();
    }

}
