package com.example.restbasedspringboot.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restbasedspringboot.exception.CustomerNotFoundException;
import com.example.restbasedspringboot.model.Customer;
import com.example.restbasedspringboot.service.CustomerService;
import com.example.restbasedspringboot.util.ResponseMessage;

@RequestMapping("customer")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> createCustomerAPI(@RequestBody Customer customer) {
		ResponseEntity<Object> response = null;
		try {
		Customer createdCustomer = customerService.add(customer);
		} catch(CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error);
		}
  
		return response;

	}		
	@GetMapping
	public ResponseEntity<Object> getAllCustomers() throws CustomerNotFoundException {
		ResponseEntity<Object> response = null;
		try {
		customerService.fetchCustomers();
		} catch(CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error);
		}
		return response;
	}
	
	@GetMapping("{customerId}")
	public ResponseEntity<Object> getCustomer(@PathVariable("customerId") int id) {
		ResponseEntity<Object> response = null;
		try {
			Customer customer = customerService.fetchCustomer(id);
		} catch (CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error);
		}
		return response;
		
	}
	
	@PutMapping("{customerId}/{dob}")
	public ResponseEntity<Object> updateCustomerDobAPI(@PathVariable("customerId") int id, @PathVariable("dob") String stringdob) {
		ResponseEntity<Object> response = null;
		try {
		Customer customer = customerService.updateCustomer(id, LocalDate.parse(stringdob));
	    response = ResponseEntity.status(200).body(customer);
		} catch (CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error);
		
	}
		return response;
	}
	
	@DeleteMapping("{customerId}")
	public Customer deleteCustomer(@PathVariable("customerId") int id) {
		
		return customerService.deleteCustomer(id);
		
	}

}
