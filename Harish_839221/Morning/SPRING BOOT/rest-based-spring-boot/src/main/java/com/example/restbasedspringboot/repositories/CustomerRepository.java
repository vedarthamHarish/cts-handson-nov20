package com.example.restbasedspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restbasedspringboot.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}


