package com.jade.backend_jade.entity;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

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
@Table (name = "tb_fatura_linha")
@AllArgsConstructor 
@NoArgsConstructor 

public class FaturaLinha {
     @Id 
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;
    private String idFactura;
    private String idProduto;
    private BigDecimal preco;
    private Integer quantidade;
    private BigDecimal valorIva;
    private BigDecimal valorDesconto;

    @CreationTimestamp
    private LocalDate dataCriacao;
}

// 1	id Primária	int(10)		UNSIGNED	Não	Nenhum		AUTO_INCREMENT	Muda Muda	Eliminar Eliminar	
// 	2	idFactura Índice	int(10)		UNSIGNED	Não	1			Muda Muda	Eliminar Eliminar	
// 	3	idProduto Índice	int(11)			Não	Nenhum			Muda Muda	Eliminar Eliminar	
// 	4	preco	decimal(15,2)			Não	Nenhum			Muda Muda	Eliminar Eliminar	
// 	5	quantidade	int(11)			Não	Nenhum			Muda Muda	Eliminar Eliminar	
// 	6	valorIva	decimal(10,2)			Não	Nenhum			Muda Muda	Eliminar Eliminar	
// 	7	valorDesconto	decimal(10,2)			Não	Nenhum			Muda Muda	Eliminar Eliminar	
// 	8	dataCriacao	timestamp	