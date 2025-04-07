package com.cola.petadoption.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cola.petadoption.entities.Pet;
import com.cola.petadoption.repository.petRepo;
@Service
public class PetService {
	@Autowired     
	private petRepo petRepository; 
	 
    public List<Pet> getAllPets() {        
    	return petRepository.findAll(); 
    } 
 
    public Optional<Pet> getPetById(Long id) {        
    	return petRepository.findById(id); 
    } 
 
    public Pet createPet(Pet pet) {        
    	return petRepository.save(pet); 
    } 
 
    public Pet updatePet(Long id, Pet petDetails) { 
        Pet pet = petRepository.findById(id).orElseThrow(() -> new 
        RuntimeException("Pet not found"));        
        pet.setName(petDetails.getName());        
        pet.setAge(petDetails.getAge());       
        pet.setBreed(petDetails.getBreed());      
        pet.setGender(petDetails.getGender());      
        pet.setDescription(petDetails.getDescription());      
        pet.setAdopted(petDetails.isAdopted());       
        return petRepository.save(pet); 
    } 
 
    public void deletePet(Long id) {        
    	petRepository.deleteById(id); 
    } 


}
