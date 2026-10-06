package com.example.drugnet;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class DrugNetService {
    public DrugNetService() {
        System.out.println("1. DrugService criado");
    }

    @PostConstruct
    public void init() {
        System.out.println("2. @PostConstruct executado");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("3. @PreDestroy executado");
    }
}
