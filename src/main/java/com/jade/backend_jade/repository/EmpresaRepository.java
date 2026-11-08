package com.jade.backend_jade.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jade.backend_jade.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, UUID> {
    // Add custom query methods if needed
    
}
