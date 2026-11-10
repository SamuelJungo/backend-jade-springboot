package com.jade.backend_jade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jade.backend_jade.entity.Empresa;
import com.jade.backend_jade.repository.EmpresaRepository;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class EmpresaService {

    @Autowired 
    private final EmpresaRepository empresaRepository;

    public Empresa saveEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public Empresa getEmpresaById(String id){
        return empresaRepository.findById(id).orElse(null);
    }
     public Empresa updateEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
     }
     public void deleteEmpresa(String id){
        empresaRepository.deleteById(id);
     }

}
