package com.cola.petadoption.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cola.petadoption.entities.AdoptionRequest;
import com.cola.petadoption.services.AdoptionRequestService;
@RestController
@RequestMapping("adoption")
public class AdoptionRequestController {
	@Autowired 
	private AdoptionRequestService adoptionRequestService; 
	 
	    // Create Adoption Request 
	    @PostMapping 
	    public AdoptionRequest createAdoptionRequest(@RequestBody AdoptionRequest request) { 
	        return adoptionRequestService.createAdoptionRequest(request); 
	    } 
	 
	    // Get all Adoption Requests 
	    @GetMapping 
	    public List<AdoptionRequest> getAllAdoptionRequests() {         
	    	return adoptionRequestService.getAllAdoptionRequests(); 
	    } 
	 
	    // Get Adoption Request by ID     @GetMapping("/{id}") 
	    public Optional<AdoptionRequest> getAdoptionRequestById(@PathVariable long id) { 
	        return adoptionRequestService.getAdoptionRequestById(id); 
	} 
	 
	    // Update Adoption Request     @PutMapping("/{id}") 
	    public String updateAdoptionRequest(@PathVariable long id, 
	@RequestBody AdoptionRequest request) { 
	        adoptionRequestService.updateAdoptionRequest(id, request);        
	        return "Adoption request updated successfully!"; 
	    } 
	 
	    // Delete Adoption Request     @DeleteMapping("/{id}") 
	    public String deleteAdoptionRequest(@PathVariable long id) {       
	    	adoptionRequestService.deleteAdoptionRequest(id);       
	    	return "Adoption request deleted successfully!"; 
	    } 


}
