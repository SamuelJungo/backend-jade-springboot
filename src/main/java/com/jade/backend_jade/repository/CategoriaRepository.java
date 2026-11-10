package com.jade.backend_jade.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jade.backend_jade.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,UUID> {
    Optional<Categoria> findById(String id);
    Optional<Categoria> deleteById(String id);
}
