package com.jade.backend_jade.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jade.backend_jade.entity.Cliente;
import com.jade.backend_jade.repository.ClienteRepository;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class ClienteService {
    @Autowired 
    private ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findALLClientes(String empresa_id){
        return clienteRepository.findAll().stream().filter(user -> user.getEmpresa_id().equals(empresa_id)).toList();
    }

    public Cliente update(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
