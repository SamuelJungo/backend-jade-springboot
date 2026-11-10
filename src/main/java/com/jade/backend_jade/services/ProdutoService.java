package com.jade.backend_jade.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jade.backend_jade.entity.Produto;
import com.jade.backend_jade.repository.ProdutoRepository;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class ProdutoService {
    @Autowired 
    private final ProdutoRepository produtoRepository;


    public Produto saveProduto(Produto produto){
        return produtoRepository.save(produto);
    }  

    public Produto updateProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public  List<Produto> findAllProduto(String empresa_id){
        return produtoRepository.findAll().stream().filter(user -> user.getEmpresa_id().equals(empresa_id)).toList();
    }
}
