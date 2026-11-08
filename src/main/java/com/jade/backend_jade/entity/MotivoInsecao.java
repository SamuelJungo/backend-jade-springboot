package com.jade.backend_jade.entity;

import java.util.UUID;

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
@Getter 
@Setter 
@Table(name = "tb_motivo_insecao")
@NoArgsConstructor 
@AllArgsConstructor 

public class MotivoInsecao {
    @Id
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;
    private String 	codigo;
    private String 	designacao;
}
