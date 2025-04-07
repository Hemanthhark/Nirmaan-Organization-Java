package com.cola.petadoption.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cola.petadoption.entities.Pet;

public interface petRepo extends JpaRepository<Pet, Long> {

}
