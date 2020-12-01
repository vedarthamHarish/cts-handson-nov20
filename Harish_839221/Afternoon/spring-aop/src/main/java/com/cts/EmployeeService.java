package com.cts;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	public void store() {
		System.out.println("store() inside EmployeeService");
	}
	
	public void delete() {
		System.out.println("delete() inside EmployeeService");
	}
	
	public String getEmployee(String name) {
		System.out.println("getEmployee(name) inside EmployeeService");
		return name;
	}
	
	public void getAllEmployees() {
		System.out.println("getAllEmployees() inside EmployeeService");
		
	}
	
	public void updateEmployee(int id,String name) {
		System.out.println("updateEmployee(id) inside EmployeeService");
	}
	
	public void getEmployeeById(int id) {
		System.out.println("getEmployeeById(id) inside EmployeeService");
	}
	
	public void getEmployeeBySalary(int id,long salary) {
		System.out.println("getEmployeeSalary(salary) inside EmployeeService");
	}

}
