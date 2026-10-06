package com.example.drugnet.controller;


import com.example.drugnet.services.GeneService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genes")
public class GeneController {
    private final GeneService service;

    public GeneController(GeneService service) {
        this.service = service;
    }
}
