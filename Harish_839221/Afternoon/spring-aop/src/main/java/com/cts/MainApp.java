package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		service.store();
		service.delete();
		service.getAllEmployees();
		service.getEmployeeById(1);
		service.getEmployee("harish");
		service.getEmployeeBySalary(1, 20000);
		service.updateEmployee(2, "Ramu");
		// TODO Auto-generated method stub

	}

}
