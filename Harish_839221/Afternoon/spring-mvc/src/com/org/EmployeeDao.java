package com.org;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//import com.cts.Employee;
//import com.cts.RowMapperImpl;

@Repository
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void storeEmployee(Employee e) {
		String query = "insert into employee values(?,?,?)";
		jdbcTemplate.update(query, e.getId(), e.getName(), e.getSalary());
		
	}
	
	public boolean deleteEmployee(int id) {
		String query = "delete from employee where id = ?";
		int status =jdbcTemplate.update(query,id);
		if(status!=0) {
			return true;
		}
		return false;
	}
	
	//public List<Employee> findEmployees() {
		//List<Employee> employees = jdbcTemplate.query("select * from employee", new RowMapperImpl());
		//return employees;
	//}

}
