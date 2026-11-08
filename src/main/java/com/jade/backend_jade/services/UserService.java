package com.jade.backend_jade.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jade.backend_jade.entity.User;
import com.jade.backend_jade.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 

public class UserService {

   @Autowired 
   private final UserRepository userRepository;

   public User saveUser(User user){
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
