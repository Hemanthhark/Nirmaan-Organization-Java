package com.cola.petadoption.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cola.petadoption.entities.AdoptionRequest;
import com.cola.petadoption.repository.adoptionRequestRepo;
@Service
public class AdoptionRequestService {
	@Autowired 
    private adoptionRequestRepo adoptionRequestRepository; 
 
    public List<AdoptionRequest> getAllAdoptionRequests() {        
    	return adoptionRequestRepository.findAll(); 
    } 
 
    public Optional<AdoptionRequest> getAdoptionRequestById(Long id) { 
        return adoptionRequestRepository.findById(id); 
    } 
 
    public AdoptionRequest createAdoptionRequest(AdoptionRequest adoptionRequest) { 
        return adoptionRequestRepository.save(adoptionRequest); 
    } 
 
    public AdoptionRequest updateAdoptionRequest(Long id, AdoptionRequest adoptionRequestDetails) {         AdoptionRequest adoptionRequest = 
       adoptionRequestRepository.findById(id).orElseThrow(() -> new 
          RuntimeException("Adoption Request not found")); 
        
             adoptionRequest.setRequestDate(adoptionRequestDetails.getRequestDate()); 
        adoptionRequest.setStatus(adoptionRequestDetails.getStatus());         
        adoptionRequest.setPet(adoptionRequestDetails.getPet());         
        adoptionRequest.setUser(adoptionRequestDetails.getUser());         
        return adoptionRequestRepository.save(adoptionRequest); 
    } 
 
    public void deleteAdoptionRequest(Long id) { 
        adoptionRequestRepository.deleteById(id); 
    } 


}
