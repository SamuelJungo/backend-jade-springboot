package com.jade.backend_jade.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.jade.backend_jade.entity.User;
import com.jade.backend_jade.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 

public class UserService {

   private final UserRepository userRepository;
   private final BCryptPasswordEncoder passwordEncoder;

   public User saveUser(User user){
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    return userRepository.save(user);
   }

   public User findByEmail(String email){
    return userRepository.findByEmail(email).orElse(null);
   }

   public List<User> findAllUsers(String empresa_id){
    return userRepository.findAll().stream().filter(user -> user.getEmpresa_id().equals(empresa_id)).toList();
   }

   public User UpdateUser(User user){
    return userRepository.save(user);
   }
}
