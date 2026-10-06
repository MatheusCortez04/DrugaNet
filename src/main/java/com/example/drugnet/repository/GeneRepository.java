package com.example.drugnet.repository;

import com.example.drugnet.domain.Gene;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneRepository extends JpaRepository<Gene,Long> { }
