package com.jade.backend_jade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jade.backend_jade.entity.Role;

public interface RoleRepository extends JpaRepository<Role , Long >{
    
}
