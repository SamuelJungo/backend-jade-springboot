package com.jade.backend_jade.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jade.backend_jade.entity.User;
import com.jade.backend_jade.services.UserService;

import lombok.RequiredArgsConstructor;

@RestController 
@RequestMapping ("/api")
@RequiredArgsConstructor 

public class UserController {
    @Autowired 
    private final UserService userService;

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping ("/users/{empresa_id}")
    public List<User> findAllUser(@PathVariable  String empresa_id) {
        System.out.println("empresa_id: " + empresa_id);
        return userService.findAllUsers(empresa_id);
    }



}
