package com.jade.backend_jade.entity;
import java.time.LocalDateTime;
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
@Table(name = "tb_sistema")

@NoArgsConstructor
@AllArgsConstructor 
public class Sistema {
    @Id 
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;

    private String sistema_nome;

    @Column (name = "sistema_nif", nullable = false, unique = true, length = 16)
    private String sistema_nif;

    @Column(name = "sistema_morada", length = 255)
    private String sistema_morada;

    @Column(name = "sistema_endereco", length = 255)
    private String sistema_endereco;

    @Column(name = "sistema_provincia", length = 100)
    private String sistema_provincia;

    @Column(name = "sistema_email", length = 150)
    private String sistema_email;

    @Column(name = "sistema_telefone", length = 30)
    private String sistema_telefone;


    private String numero_licenca;
    private String firma;
    private String versao;
    



    @CreationTimestamp 
    @Column(name = "data_criacao", updatable = false)
    private LocalDateTime data_criacao;
}
