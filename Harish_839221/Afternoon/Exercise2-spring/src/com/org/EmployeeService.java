package com.org;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public String fetchDateTimeService() {
		return dao.fetchDateTime();
	}
	
	public List<Employee> getAllEmployeesNamesInReverseOrder() {
		List<Employee> list = dao.fetchAllEmployees().stream()
		.sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
		.collect(Collectors.toList());
		return list;
	}
	
	public List<Employee> getEmployeeNameInAscendingOrder(){
		List<Employee> list = dao.fetchAllEmployees().stream()
				.sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
				return list;
	}
	
	public List<Employee> getEmployeeIDInAscendingOrder(){
		List<Employee> list = dao.fetchAllEmployees().stream()
				.sorted((e1, e2) -> e1.getId()-e2.getId())
				.collect(Collectors.toList());
				return list;
	}
	
	public List<Employee> getEmployeeIDInDescendingOrder(){
		List<Employee> list = dao.fetchAllEmployees().stream()
				.sorted((e1, e2) -> e2.getId()-e1.getId())
				.collect(Collectors.toList());
				return list;
	}
	
	public List<Employee> getEmployeeSalaryInAscendingOrder(){
		List<Employee> list = dao.fetchAllEmployees().stream()
				.sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
				.collect(Collectors.toList());
				return list;
	}
	
	public List<Employee> getEmployeeSalaryInDescendingOrder(){
		List<Employee> list = dao.fetchAllEmployees().stream()
				.sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
				.collect(Collectors.toList());
				return list;
	}
	
	public Employee fetchEmployee(int id) {
		return dao.fetchEmployee(id);
	}
}
