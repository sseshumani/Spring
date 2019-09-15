package com.BT.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.BT.spring.springmvc.dto.User;

@Controller
public class UserController {

	@RequestMapping("registrationPage")
//	public ModelAndView showRegistrationPage()
	public String showRegistrationPage() {
		/*
		 * ModelAndView modelAndView = new ModelAndView();
		 * modelAndView.setViewName("userReg");
		 */
		return "userReg";
	}

	/*
	 * @RequestMapping(value="registerUser", method = RequestMethod.POST) public
	 * ModelAndView registerUser(@ModelAttribute("user")User user) {
	 * System.out.println(user); ModelAndView modelAndView = new ModelAndView();
	 * modelAndView.addObject("user", user); modelAndView.setViewName("regResult");
	 * return modelAndView; }
	 */

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		System.out.println(user);

		model.addAttribute("user", user);

		return "regResult";
	}

}
