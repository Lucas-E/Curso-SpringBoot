package com.cursojava.springboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursojava.springboot.curso.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
