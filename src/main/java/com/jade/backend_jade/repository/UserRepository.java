package com.jade.backend_jade.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jade.backend_jade.entity.User;
@Repository 
public interface UserRepository extends JpaRepository<User, UUID> {
      Optional<User> findByEmail(String email);
}
