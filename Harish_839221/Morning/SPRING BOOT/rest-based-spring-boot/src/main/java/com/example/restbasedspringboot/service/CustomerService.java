package com.example.restbasedspringboot.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restbasedspringboot.exception.CustomerNotFoundException;
import com.example.restbasedspringboot.model.Customer;
import com.example.restbasedspringboot.repositories.CustomerRepository;

@Service
public class CustomerService {

	//private static List<Customer> customerDatabase = new ArrayList<>();
	@Autowired
	private CustomerRepository dao;

	public Customer add(Customer customer) throws CustomerNotFoundException {
		Customer createdCustomer = dao.save(customer);
		if(createdCustomer != null) {
			return createdCustomer;
		}
		else
			throw new CustomerNotFoundException("Sorry unable to add Customer");
		
		/*customer.setCustomerId(new Double(Math.random() * 10000).intValue());
		customerDatabase.add(customer);
		return customer;*/
	}

	public Customer fetchCustomer(int id) throws CustomerNotFoundException {
		Optional<Customer> option = dao.findById(id);
		if(option.isPresent())
			return option.get();
		else
		  throw new CustomerNotFoundException("Sorry customer not found");

		//return customerDatabase.stream().filter(customer -> customer.getCustomerId() == id).findAny().get();
	}

	public List<Customer> fetchCustomers() throws CustomerNotFoundException {
		List<Customer> list = new ArrayList<>();
		if(list != null) {
		return dao.findAll();
		} else
			throw new CustomerNotFoundException("No Customer available");
		
		// TODO Auto-generated method stub
		//return customerDatabase;
	}
	
	public Customer updateCustomer(int id, LocalDate dob) throws CustomerNotFoundException {
		Customer customer = fetchCustomer(id);
		if(customer != null) {
			customer.setDob(dob);
			return dao.save(customer);
		}
		else 
			return null;
	}
	
	public Customer deleteCustomer(int id) {
		Customer customer = new Customer();
		Optional<Customer> option = dao.findById(id);
		if(option.isPresent()) {
			dao.delete(customer);
			return customer;
		}
		else
			return null;
	}

}
