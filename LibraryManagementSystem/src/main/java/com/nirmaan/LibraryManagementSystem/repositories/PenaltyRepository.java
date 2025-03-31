package com.nirmaan.LibraryManagementSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirmaan.LibraryManagementSystem.entities.Loan;
import com.nirmaan.LibraryManagementSystem.entities.Penalty;

public interface PenaltyRepository extends JpaRepository<Penalty, Long> {
    
	// Custom method to find an unpaid penalty by loan
	Penalty findByLoanAndPaidFalse(Loan loan);
	
	List<Penalty> findByUserId(Long userId);

}
