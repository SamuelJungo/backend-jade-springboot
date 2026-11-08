package com.jade.backend_jade.entity;
import java.util.UUID;

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
@Table (name = "tb_estado")
@AllArgsConstructor 
@NoArgsConstructor 

public class Estado {
    @Id 
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;
    @Column 
    private String desgnacao;
 
    
}
