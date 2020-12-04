package com.example.restbasedspringboot.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restbasedspringboot.model.Customer;
import com.example.restbasedspringboot.service.CustomerService;

@RequestMapping("customer")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer createCustomerAPI(@RequestBody Customer customer) {
		
        Customer createdCustomer = customerService.add(customer);
		return createdCustomer;

	}
	@GetMapping
	public List<Customer> getAllCustomers() {
		return customerService.fetchCustomers();
	}
	
	@GetMapping("{customerId}")
	public Customer getCustomer(@PathVariable("customerId") int id) {
		return customerService.fetchCustomer(id);
	}
	
	@PutMapping("{customerId}/{dob}")
	public Customer updateCustomerDobAPI(@PathVariable("customerId") int id, @PathVariable("dob") String stringdob) {
		return customerService.updateCustomer(id, LocalDate.parse(stringdob));
	}
	
	@DeleteMapping("{customerId}")
	public Customer deleteCustomer(@PathVariable("customerId") int id) {
		
		return customerService.deleteCustomer(id);
		
	}

}
