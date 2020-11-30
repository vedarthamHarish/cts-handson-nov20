package com.cts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao dao;
	
	public void storeEmployee() {
		System.out.println("storeEmployee() in employeeService ");
		dao.store();
	}
}