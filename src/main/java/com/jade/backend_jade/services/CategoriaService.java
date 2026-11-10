package com.jade.backend_jade.services;

import java.util.List;

import org.hibernate.annotations.Audited;
import org.springframework.stereotype.Service;

import com.jade.backend_jade.entity.Categoria;
import com.jade.backend_jade.repository.CategoriaRepository;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class CategoriaService {
    
    @Audited
    private final CategoriaRepository categoriaRepository;
    
    
    public Categoria saveCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
    public List<Categoria> findALLCategorias(String empresa_id){
        return categoriaRepository.findAll().stream().filter(user -> user.getEmpresa_id().equals(empresa_id)).toList();
    }

    public Categoria getCategoriaById(String id){
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria updateCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public void deleteCategoria(String id){
        categoriaRepository.deleteById(id);
    }
}
