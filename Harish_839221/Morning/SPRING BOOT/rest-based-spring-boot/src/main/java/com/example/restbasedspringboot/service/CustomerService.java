package com.example.restbasedspringboot.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restbasedspringboot.model.Customer;
import com.example.restbasedspringboot.repositories.CustomerRepository;

@Service
public class CustomerService {

	//private static List<Customer> customerDatabase = new ArrayList<>();
	@Autowired
	private CustomerRepository dao;

	public Customer add(Customer customer) {
		Customer createdCustomer = dao.save(customer);
		return createdCustomer;
		/*customer.setCustomerId(new Double(Math.random() * 10000).intValue());
		customerDatabase.add(customer);
		return customer;*/
	}

	public Customer fetchCustomer(int id) {
		Optional<Customer> option = dao.findById(id);
		if(option.isPresent())
			return option.get();
		else
			return null;

		//return customerDatabase.stream().filter(customer -> customer.getCustomerId() == id).findAny().get();
	}

	public List<Customer> fetchCustomers() {
		return dao.findAll();
		// TODO Auto-generated method stub
		//return customerDatabase;
	}
	
	public Customer updateCustomer(int id, LocalDate dob) {
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
