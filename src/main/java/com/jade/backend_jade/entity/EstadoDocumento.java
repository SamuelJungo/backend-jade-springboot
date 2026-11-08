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
@Table (name = "tb_estado_documento")
@AllArgsConstructor 
@NoArgsConstructor 

public class EstadoDocumento {
    @Id 
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;

    private String desgnacao;
}
