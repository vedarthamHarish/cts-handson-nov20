package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public ModelAndView viewDateTime() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.fetchDateTimeService());
		return mav;
	}
	
	@RequestMapping(value = "/sortByNameReverse", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesNameInReverseOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesNamesInReverseOrder());
		return mav;
	}
	
	@RequestMapping(value="/sortByNameAsc" , method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesNameInAscOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeNameInAscendingOrder());
		return mav;
	}
	@RequestMapping(value="/sortByIdAsc" , method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesIdInAscOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeIDInAscendingOrder());
		return mav;
	}
	@RequestMapping(value="/sortByIdDesc" , method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesIdInDescOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeIDInDescendingOrder());
		return mav;
	}
	@RequestMapping(value="/sortBySalaryAsc" , method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesSalaryInAscOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeSalaryInAscendingOrder());
		return mav;
	}
	@RequestMapping(value="/sortBySalaryDesc" , method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesSalaryInDescOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeSalaryInDescendingOrder());
		return mav;
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public ModelAndView extractEmployee(@RequestParam("employeeId") int empId) {
		ModelAndView mav = new ModelAndView("hello", "msg", service.fetchEmployee(empId));
		return mav;
	}
	
	@RequestMapping(value = "multipleKeys", method = RequestMethod.GET)
	public ModelAndView fetchMulitpleKeys() {
		ModelAndView mav = null;
		// cretae ModelMap
		ModelMap modelMap = new ModelMap();
		modelMap.put("title", "Simple Title");
		modelMap.put("employeeObject", new Employee(100, "Raj", 35000));
		modelMap.put("employeeList", service.getAllEmployeesNamesInReverseOrder());
		mav = new ModelAndView("welcome", "model", modelMap);
		return mav;
	}
}

