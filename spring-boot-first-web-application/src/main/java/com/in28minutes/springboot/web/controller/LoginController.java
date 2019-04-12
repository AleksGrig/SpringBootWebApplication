package com.in28minutes.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// /login => "Hello world"
@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	// @ResponseBody
	public String showLoginPage(ModelMap model) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	// @ResponseBody
	public String showWelcomePage(ModelMap model, @RequestParam String name) {
		model.put("name", name);
		return "welcome";
	}

}
