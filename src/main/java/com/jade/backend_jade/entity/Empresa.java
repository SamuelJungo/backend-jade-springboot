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
@Getter 
@Setter 
@Table(name = "tb_empresa")
@NoArgsConstructor 
@AllArgsConstructor 
public class Empresa {
     @Id
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;

    @Column (name = "empresa_nome", nullable = false, length = 150)
    private String empresa_nome;

    @Column(name = "empresa_nif", nullable = false, unique = true, length = 16)
    private String empresa_nif;

    @Column(name = "empresa_morada", length = 255)
    private String empresa_morada;

    @Column(name = "empresa_endereco", length = 255)
    private String empresa_endereco;

    @Column(name = "empresa_provincia", length = 100)
    private String empresa_provincia;

    @Column(name = "empresa_email", length = 150)
    private String empresa_email;

    @Column(name = "empresa_telefone", length = 30)
    private String empresa_telefone;

    @Column(name = "empresa_logotipo", length = 255)
    private String empresa_logotipo;

    @Column(name = "empresa_regime", length = 50)
    private String empresa_regime;

    @CreationTimestamp 
    @Column(name = "data_criacao", updatable = false)
    private LocalDateTime data_criacao;
    
}
