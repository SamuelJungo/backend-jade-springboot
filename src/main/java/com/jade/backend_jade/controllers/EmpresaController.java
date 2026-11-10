package com.jade.backend_jade.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jade.backend_jade.entity.Empresa;
import com.jade.backend_jade.services.EmpresaService;

import lombok.RequiredArgsConstructor;

@RestController 
@RequestMapping ("/api")
@RequiredArgsConstructor

public class EmpresaController {
    
  @Autowired 
  private final EmpresaService empresaService;


  @PostMapping("/empresa")
    public Empresa saveEmpresa(@RequestBody Empresa empresa){
        System.out.println(empresa);
        return empresaService.saveEmpresa(empresa);
    }
   

}
