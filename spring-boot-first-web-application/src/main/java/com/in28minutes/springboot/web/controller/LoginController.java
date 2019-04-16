package com.in28minutes.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.springboot.web.service.LoginServiceInterface;

@Controller
@SessionAttributes("name")
public class LoginController {

	// Injected automatically
	@Autowired
	LoginServiceInterface service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	// @ResponseBody
	public String showLoginPage(ModelMap model) {
		model.put("name", "aurelius");
		return "welcome";
	}
}
