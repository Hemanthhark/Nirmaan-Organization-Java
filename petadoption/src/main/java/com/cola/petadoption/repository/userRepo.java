package com.cola.petadoption.repository;

import java.util.function.LongBinaryOperator;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cola.petadoption.entities.User;

public interface userRepo extends JpaRepository<User, Long> {

}
