package com.cts;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	public void store() {
	  System.out.println("store() method in Dao class");	
	}
}