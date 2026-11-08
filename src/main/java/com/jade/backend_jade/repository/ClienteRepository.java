package com.jade.backend_jade.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jade.backend_jade.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
    // Add custom query methods if needed
    
}
