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
@Setter 
@Getter 
@Table (name = "tb_forma_pagamento")
@AllArgsConstructor 
@NoArgsConstructor 

public class FormaPagamento {
    @Id 
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String sigla;
    private String designacao;
}
	// id Primária	int(11)		UNSIGNED	Não	Nenhum		AUTO_INCREMENT	Muda Muda	Eliminar Eliminar	
	// 2	sigla	varchar(50)	latin1_swedish_ci		Não	Nenhum			Muda Muda	Eliminar Eliminar	
	// 3	designacao	varchar(50)	latin1_swedish_ci