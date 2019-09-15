package com.BT.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BT.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {
	
	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView ModelAndView =new ModelAndView();
		ModelAndView.setViewName("displayObject");
		Employee employee = new Employee();
		employee.setId(303);
		employee.setName("hehe");
		employee.setSalary(8000);
		ModelAndView.addObject("employee", employee);
		return ModelAndView ;
	}

}
