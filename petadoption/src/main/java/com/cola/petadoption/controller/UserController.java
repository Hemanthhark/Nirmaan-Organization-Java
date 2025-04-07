package com.cola.petadoption.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cola.petadoption.entities.User;
import com.cola.petadoption.services.UserService;
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired     
    private UserService userService;     // Create 
    @PostMapping 
    public User createUser(@RequestBody User user) {         
    	return userService.createUser(user);
    } 
 
    // Read All     
    @GetMapping     
    public List<User> getAllUsers() {         
    	return userService.getAllUsers(); 
    } 
 
    // Read by ID 
    @GetMapping("/{id}") 
    public Optional<User> getUserById(@PathVariable long id) {         
    	return userService.getUserById(id); 
    } 
 
  
    // Update 
    @PutMapping("/{id}")     
    public String updateUser(@PathVariable long id, @RequestBody User user) {         
    	userService.updateUser(id, user);         
    	return "User updated successfully!"; 
    } 
 
    // Delete 
    @DeleteMapping("/{id}") 
    public String deleteUser(@PathVariable long id) {         
    	userService.deleteUser(id);         
    	return "User deleted successfully!"; 
    } 


}
