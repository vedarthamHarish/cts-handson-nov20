package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService empservice;
	@RequestMapping(value="/hi")
	public String Model() { 
		return "sucess";
	}
	
	@RequestMapping(value="/employee" ,method = RequestMethod.POST)
	public ModelAndView emp(@RequestParam("employeeId") int empid,@RequestParam("employeeName") String empname,@RequestParam("employeeSalary") double empsalary) {
		ModelAndView mav = new ModelAndView("sucess","msg",empservice.storeEmployee(empid, empname, empsalary));
		
		return mav;
		
	}
	
	@RequestMapping(value = "/emp", method = RequestMethod.POST)
	public ModelAndView extractEmployee(@RequestParam("employeeId") int empId) {
		ModelAndView mav = new ModelAndView("sucess", "msg", empservice.deleteEmployee(empId));
		return mav;
	}

}
