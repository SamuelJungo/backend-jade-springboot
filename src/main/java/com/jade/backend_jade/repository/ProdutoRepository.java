package com.jade.backend_jade.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jade.backend_jade.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
    // Add custom query methods if needed
    
}
