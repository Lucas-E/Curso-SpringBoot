package com.cursojava.springboot.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.springboot.curso.repositories.UserRepository;
import com.cursojava.springboot.curso.entities.User;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;


    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findUser(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

}
