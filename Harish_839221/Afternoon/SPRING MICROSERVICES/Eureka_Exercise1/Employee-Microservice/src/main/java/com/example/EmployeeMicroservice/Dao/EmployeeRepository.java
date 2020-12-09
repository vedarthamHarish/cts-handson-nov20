package com.example.EmployeeMicroservice.Dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeMicroservice.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
