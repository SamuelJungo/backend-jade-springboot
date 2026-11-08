package com.jade.backend_jade.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jade.backend_jade.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,UUID> {
    
}
