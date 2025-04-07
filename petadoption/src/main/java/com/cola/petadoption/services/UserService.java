package com.cola.petadoption.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cola.petadoption.entities.User;
import com.cola.petadoption.repository.userRepo;

@Service 
public class UserService {
	@Autowired     
	private userRepo userRepository;     
	public List<User> getAllUsers() {         
		return userRepository.findAll();  }     
	public Optional<User> getUserById(Long id) {         
		return userRepository.findById(id); 
    } 
    public User createUser(User user) {         
    	return userRepository.save(user); 
    } 
 
    public User updateUser(Long id, User userDetails) {         
    	User user = userRepository.findById(id).get();         
    	user.setName(userDetails.getName());        
    	user.setEmail(userDetails.getEmail());         
    	user.setPassword(userDetails.getPassword());        
    	user.setPhoneNo(userDetails.getPhoneNo());        
    	user.setRole(userDetails.getRole());        
    	user.setAddress(userDetails.getAddress());        
    	return userRepository.save(user); 
    } 
    public void deleteUser(Long id) {         
    	userRepository.deleteById(id); 
    }
	

	
}
