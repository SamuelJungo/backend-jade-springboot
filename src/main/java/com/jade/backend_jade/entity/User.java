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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Data 
@Table(name = "tb_user")
@Setter 
@Getter 
@NoArgsConstructor 
@AllArgsConstructor 

public class User {
    @Id 
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;

    @Column 
    private String nome;
    @Column 
    private String password;

    private String email;
    @Column (name = "morada", columnDefinition = "varchar(255) default 'Luanda'")
    private String morada;
    @Column (name = "empresa_id", columnDefinition = "varchar(255) default '0'")
    private String empresa_id;
    @Column (name = "nif", columnDefinition = "varchar(255) default '999999999'")
    private String nif;
    @Column (name = "telefone", columnDefinition = "varchar(255) default '999999999'")
    private String  telefone;
    @Column (name = "role", columnDefinition = "varchar(255) default 'USER'")
    private String  role;

    @CreationTimestamp 
    @Column (name = "data_criacao", updatable = false)
    private LocalDate data_criacao;

}
