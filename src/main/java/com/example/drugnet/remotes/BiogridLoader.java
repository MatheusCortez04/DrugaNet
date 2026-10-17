package com.example.drugnet.remotes;

import org.springframework.stereotype.Component;

@Component
public class BiogridLoader implements NetworkLoader {
    public void load() {
        System.out.println("Carregando BioGRID...");
    }
}