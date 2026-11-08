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
@Table(name = "tb_taxa_type")
@Setter 
@Getter 
@NoArgsConstructor 
@AllArgsConstructor 


public class TaxaType {
    @Id 
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;
    private String sigla;
    private String designacao;
}
