package com.cursojava.springboot.curso.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.springboot.curso.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> getAll(){

        User user = new User(1L, "Lucas", "lucasem911@gmail.com", "81992162519", "12345");
        return ResponseEntity.ok().body(user);
    }
}
