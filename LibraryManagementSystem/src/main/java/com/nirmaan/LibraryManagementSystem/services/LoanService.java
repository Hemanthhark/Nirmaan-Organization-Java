package com.nirmaan.LibraryManagementSystem.services;

import com.nirmaan.LibraryManagementSystem.entities.Loan;
import com.nirmaan.LibraryManagementSystem.entities.Book;
import com.nirmaan.LibraryManagementSystem.entities.User;
import com.nirmaan.LibraryManagementSystem.repositories.LoanRepository;
import com.nirmaan.LibraryManagementSystem.repositories.BookRepository;
import com.nirmaan.LibraryManagementSystem.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    public Loan getLoanById(Long id) {
        return loanRepository.findById(id).orElse(null);
    }

    public Loan saveLoan(Loan loan) {
        // Fetch the Book object from the DB
        Book book = bookRepository.findById(loan.getBook().getId())
                .orElseThrow(() -> new RuntimeException("Book not found"));

        // Fetch the User object from the DB
        User user = userRepository.findById(loan.getUser().getId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Set the fetched Book and User before saving
        loan.setBook(book);
        loan.setUser(user);

        return loanRepository.save(loan);
    }

    public void deleteLoan(Long id) {
        loanRepository.deleteById(id);
    }

    public Loan updateLoan(Loan loan, Long id) {
        loan.setId(id);
        return loanRepository.save(loan);
    }
}
