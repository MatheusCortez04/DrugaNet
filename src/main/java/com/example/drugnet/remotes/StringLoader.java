package com.example.drugnet.remotes;

import org.springframework.stereotype.Component;

@Component("stringLoader")
public class StringLoader implements NetworkLoader{
    public void load() {
        System.out.println("Carregando STRING...");
    }
}
