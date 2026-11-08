package com.jade.backend_jade.entity;
import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter 
@Getter 
@Table (name = "tb_cliente")
@AllArgsConstructor 
@NoArgsConstructor 

public class Cliente {
    @Id 
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;

    private String password;

    private String email;

    private String morada;

    private String nif;

    private String  telefone;

    private String  role;

    private String empresa_id;
    @CreationTimestamp 
    @Column (name = "data_criacao", updatable = false)
    private LocalDate data_criacao;

}
