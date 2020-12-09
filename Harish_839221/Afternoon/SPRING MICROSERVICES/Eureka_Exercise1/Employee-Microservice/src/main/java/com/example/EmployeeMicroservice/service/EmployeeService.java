package com.example.EmployeeMicroservice.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeMicroservice.Dao.EmployeeRepository;
import com.example.EmployeeMicroservice.Exception.EmployeeNotFoundException;
import com.example.EmployeeMicroservice.Model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository dao;

	public Employee add(Employee employee) throws EmployeeNotFoundException {
		Employee createdEmployee = dao.save(employee);
		if(createdEmployee != null) {
			return createdEmployee;
		}
		else
			throw new EmployeeNotFoundException("Sorry unable to add Employee");
	}

	public Employee fetchEmployee(int id) throws EmployeeNotFoundException {
		Optional<Employee> option = dao.findById(id);
		if(option.isPresent())
			return option.get();
		else
		  throw new EmployeeNotFoundException("Sorry employee not found");

		//return customerDatabase.stream().filter(customer -> customer.getCustomerId() == id).findAny().get();
	}

	public List<Employee> fetchEmployees() throws EmployeeNotFoundException {
		List<Employee> list = new ArrayList<>();
		if(list != null) {
		return dao.findAll();
		} else
			throw new EmployeeNotFoundException("No Employees available");
		
		// TODO Auto-generated method stub
		//return customerDatabase;
	}
	
	public Employee updateEmployee(int id, double salary) throws EmployeeNotFoundException {
		Employee employee = fetchEmployee(id);
		if(employee != null) {
			employee.setSalary(salary);
			return dao.save(employee);
		}
		else 
			return null;
	}
	
	public Employee deleteEmployee(int id) {
		Employee employee = new Employee();
		Optional<Employee> option = dao.findById(id);
		if(option.isPresent()) {
			dao.delete(employee);
			return employee;
		}
		else
			return null;
	}

}
