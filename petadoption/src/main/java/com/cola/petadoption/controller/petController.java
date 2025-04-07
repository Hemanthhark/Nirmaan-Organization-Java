package com.cola.petadoption.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cola.petadoption.entities.Pet;
import com.cola.petadoption.services.PetService;
@RestController
@RequestMapping("pet")
public class petController {
	@Autowired 
    private PetService petService; 
 
// Create Pet     @PostMapping 
    public Pet createPet(@RequestBody Pet pet) {         
    	return petService.createPet(pet); 
    } 
 
    // Get all Pets 
    @GetMapping     
    public List<Pet> getAllPets() {        
    	return petService.getAllPets(); 
    } 
 
    // Get Pet by ID 
    @GetMapping("/{id}") 
    public Optional<Pet> getPetById(@PathVariable long id) {         
    	return petService.getPetById(id); 
    } 
  
// Update Pet 
@PutMapping("/{id}") 
    public String updatePet(@PathVariable long id, @RequestBody Pet pet) { 
        petService.updatePet(id, pet);         
        return "Pet updated successfully!"; 
    } 
 
    // Delete Pet 
    @DeleteMapping("/{id}") 
    public String deletePet(@PathVariable long id) {       
    	petService.deletePet(id);      
    	return "Pet deleted successfully!"; 
    } 


}
