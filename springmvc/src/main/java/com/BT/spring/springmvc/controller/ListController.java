package com.BT.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BT.spring.springmvc.dto.Employee;

@Controller
public class ListController {
	
	@RequestMapping("/readList")
	public ModelAndView sendObject() {
		ModelAndView ModelAndView =new ModelAndView();
		ModelAndView.setViewName("displayList");
		Employee employee = new Employee();
		employee.setId(303);
		employee.setName("hehe");
		employee.setSalary(8000);
		
		Employee employee2 = new Employee();
		employee2.setId(301);
		employee2.setName("haha");
		employee2.setSalary(5000);
		
		Employee employee3 = new Employee();
		employee3.setId(304);
		employee3.setName("hihi");
		employee3.setSalary(7000);
		
		
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(employee2);
		employees.add(employee3);
		
		
		ModelAndView.addObject("employees", employees);
		
		return ModelAndView ;
	}

}
