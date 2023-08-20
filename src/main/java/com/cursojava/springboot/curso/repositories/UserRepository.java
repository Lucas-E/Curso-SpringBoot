package com.cursojava.springboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.springboot.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
