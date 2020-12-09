package com.example.EmployeeMicroservice.controller;


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

import com.example.EmployeeMicroservice.Exception.EmployeeNotFoundException;
import com.example.EmployeeMicroservice.Model.Employee;
import com.example.EmployeeMicroservice.service.EmployeeService;
//import com.example.EmployeeMicroservice.util.ResponseMessage;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee createEmployeeAPI(@RequestBody Employee employee) throws EmployeeNotFoundException {
		Employee createdEmployee = employeeService.add(employee);
		return createdEmployee;

	}		
	@GetMapping
	public List<Employee> getAllEmployees() throws EmployeeNotFoundException {
	    return	employeeService.fetchEmployees();
	}
	
	@GetMapping("{id}")
	public Employee getEmployee(@PathVariable("id") int id) throws EmployeeNotFoundException {
		
			Employee employee = employeeService.fetchEmployee(id);
			return employee;
	}

	
	@PutMapping("{id}/{salary}")
	public Employee updateEmployeeSalaryAPI(@PathVariable("id") int id, @PathVariable("salary") double salary) throws EmployeeNotFoundException {
		Employee employee = employeeService.updateEmployee(id, salary);
		return employee;

	}
	
	@DeleteMapping("{id}")
	public Employee deleteEmployee(@PathVariable("id") int id) {
		
		return employeeService.deleteEmployee(id);
		
	}

}
