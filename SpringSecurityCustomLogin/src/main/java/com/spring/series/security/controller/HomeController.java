package com.spring.series.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	// http://localhost:8080/SpringSecurity/home
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage(ModelMap modelMap) {

		modelMap.addAttribute("topic", "Welcome to the Spring Security Learning");
		modelMap.addAttribute("description", "This is HOME Page");
		return "home";
	}

	// http://localhost:8080/SpringSecurity/admin
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView modelAndView = new ModelAndView("admin");
		modelAndView.addObject("topic", "Welcome to the Spring Security Learning");
		modelAndView.addObject("description", "This is ADMIN page");
		return modelAndView;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {

		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		model.addObject("message", "Login with Username and Password");
		return model;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logoutPage() {

		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		model.addObject("message", "Logout successful");
		return model;
	}

	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public ModelAndView errorPage() {

		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		model.addObject("message", "Invalid Username or Password");
		return model;
	}
}