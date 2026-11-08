
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
@Table(name = "tb_produto")
@NoArgsConstructor 
@AllArgsConstructor 
public class Produto {
    @Id 
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String codigoBarra;
    private Double precoCompra;
    private Double precoVenda;
    private String idIva;
    private String idMotivoIsencao;
    private String idEstado;
    private String empresa_id;
    private String img_url;
    private String id_categoria;
    private String idProductType;
    private String unidade;
    @CreationTimestamp 
    @Column (name = "data_criacao", updatable = false)
    private LocalDateTime data_criacao;

}
// id	nome	codigoBarra	precoCompra	precoVenda	idIva	idMotivoIsencao	idEstado	empresa_id	img_url	id_categoria	idProductType