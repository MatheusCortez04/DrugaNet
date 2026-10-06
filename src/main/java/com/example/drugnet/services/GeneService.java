package com.example.drugnet.services;


import com.example.drugnet.repository.GeneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneService {

    @Autowired
    private final GeneRepository repository;

//    public GeneService(GeneRepository repository) {
//        this.repository = repository;
//    }
}