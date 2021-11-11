package com.assignment.one.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.one.Customer.Customer;
import com.assignment.one.repo.CustomerDao;
import com.assignment.one.service.CustomerService;



@RestController
@RequestMapping("/Customers")
public class CustomerController {
	
	@Autowired
	private CustomerDao customerdao;
	
	@Autowired
	private CustomerService customerservice;
	
	@GetMapping
	public ResponseEntity<List<Customer>> getCustomer(){
		List<Customer> customers=customerservice.getCustomer();
		 return   ResponseEntity.ok(customers);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Customer>> getCustomerbyId(@PathVariable int id){
	    Optional<Customer> customer=   customerservice.getCustomerbyId(id);	
	
		 return   ResponseEntity.ok(customer);
		
	}
	
	@PostMapping("/join")
	public ResponseEntity<String> addCustomer(@RequestBody Customer c) {
		customerservice.addCustomer(c);
		List<Customer> customers=customerservice.getCustomer();
		return ResponseEntity.ok("Successfully Added\n"+customers);
	}
	


}
