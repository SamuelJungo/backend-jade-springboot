package com.jade.backend_jade.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaLinhaRepository extends JpaRepository<FaturaLinhaRepository, UUID> {
    // Add custom query methods if needed
    
}
