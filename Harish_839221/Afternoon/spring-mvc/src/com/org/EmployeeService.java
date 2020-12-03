package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	public String storeEmployee(int id,String name,double salary) {
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		dao.storeEmployee(e);
		return "Stored Sucessfully";
	}
	
	public String deleteEmployee(int id) {
		if(dao.deleteEmployee(id)) {
			return "Deleted";
		}
		return "Sorry";
	}
	
	//public List<Employee> findEmployees() {
	//	return dao.findEmployees();
	//}

}
