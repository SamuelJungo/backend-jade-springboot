package com.jade.backend_jade.entity;

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
@Table(name = "tb_roles")
@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
public class Role {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private Long role_id;
    private String name;

 
    
}
