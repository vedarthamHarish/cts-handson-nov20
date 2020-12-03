

package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class EmployeeController {
	@ResponseBody
	public String hel() {
		return "hello";
	}
	
	
	@RequestMapping(value = "/greetings", method = RequestMethod.GET)
	public ModelAndView getMessage() {
		System.out.println("---- request reached getMessage() -----");
		ModelAndView mav = new ModelAndView("hello", "msg", "Hello World");
		return mav;
	}
	

}
