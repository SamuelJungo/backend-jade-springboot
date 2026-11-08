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
@Table (name = "tb_fatura")
@AllArgsConstructor 
@NoArgsConstructor 

public class Fatura {
    @Id 
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;
    private String numero;
    private BigDecimal totalFactura;
    private BigDecimal totalIncidente;
    private BigDecimal totalPago;
    private BigDecimal taxaIva;
    private BigDecimal taxaDesconto;
    private String idUtilizadores;
    private String idEstadoFactura;
    private String idTipoDocumento;
    private String idCliente;
    private String idFormaPagemento;
    private String idEstado;
    private String hash;
    
    private String empresa_id;
    private String hash_prefix;
     @CreationTimestamp 
    private LocalDate dataCriacao;
}


// numero	varchar(50)	latin1_swedish_ci		Não	0			Muda Muda	Eliminar Eliminar	
// 	3	totalFactura	decimal(10,2)		UNSIGNED	Não	0.00			Muda Muda	Eliminar Eliminar	
// 	4	totalIncidente	decimal(10,2)		UNSIGNED	Não	0.00			Muda Muda	Eliminar Eliminar	
// 	5	totalPago	decimal(10,2)		UNSIGNED	Não	0.00			Muda Muda	Eliminar Eliminar	
// 	6	taxaIva	decimal(10,2)		UNSIGNED	Não	0.00			Muda Muda	Eliminar Eliminar	
// 	7	taxaDesconto	decimal(10,2)		UNSIGNED	Não	0.00			Muda Muda	Eliminar Eliminar	
// 	8	idUtilizadores Índice	int(10)		UNSIGNED	Não	1			Muda Muda	Eliminar Eliminar	
// 	9	idEstadoFactura Índice	int(10)		UNSIGNED	Não	1			Muda Muda	Eliminar Eliminar	
// 	10	idTipoDocumento Índice	int(10)			Não	1			Muda Muda	Eliminar Eliminar	
// 	11	idCliente Índice	int(10)		UNSIGNED	Não	1			Muda Muda	Eliminar Eliminar	
// 	12	idFormaPagemento Índice	int(10)		UNSIGNED	Não	1			Muda Muda	Eliminar Eliminar	
// 	13	idEstado Índice	int(10)			Não	1			Muda Muda	Eliminar Eliminar	
// 	14	hash	varchar(172)	latin1_swedish_ci		Sim	NULL			Muda Muda	Eliminar Eliminar	
// 	15	dataCriacao	timestamp			Não	current_timestamp()		ON UPDATE CURRENT_TIMESTAMP()	Muda Muda	Eliminar Eliminar	
// 	16	empresa_id	int(11)			Não	Nenhum			Muda Muda	Eliminar Eliminar	
// 	17	hash_prefix