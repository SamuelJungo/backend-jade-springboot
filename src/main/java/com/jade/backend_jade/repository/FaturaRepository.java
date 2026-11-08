package com.jade.backend_jade.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jade.backend_jade.entity.Fatura;

public interface FaturaRepository extends JpaRepository<Fatura, UUID> {
    // Add custom query methods if needed
    
}
