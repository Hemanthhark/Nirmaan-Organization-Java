package com.cola.petadoption.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class User { 
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)     
    private Long id;     
    private String name;     
    private String email;     
    private String password;     
    private Long phoneNo;     
    private String role;     
    private String address; 
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)    
    private List<Pet> pets; 
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)     
    private List<AdoptionRequest> adoptionRequests; 
    // Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Pet> getPets() {
		return pets;
	}
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	public List<AdoptionRequest> getAdoptionRequests() {
		return adoptionRequests;
	}
	public void setAdoptionRequests(List<AdoptionRequest> adoptionRequests) {
		this.adoptionRequests = adoptionRequests;
	}
	public User(Long id, String name, String email, String password, Long phoneNo, String role, String address,
			List<Pet> pets, List<AdoptionRequest> adoptionRequests) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
		this.role = role;
		this.address = address;
		this.pets = pets;
		this.adoptionRequests = adoptionRequests;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
} 
