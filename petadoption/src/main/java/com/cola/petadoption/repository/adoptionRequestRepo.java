package com.cola.petadoption.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cola.petadoption.entities.AdoptionRequest;

public interface adoptionRequestRepo extends JpaRepository<AdoptionRequest, Long> {

}
