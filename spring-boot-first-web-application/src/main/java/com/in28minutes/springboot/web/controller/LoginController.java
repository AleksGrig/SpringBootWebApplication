package com.in28minutes.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// /login => "Hello world"
@Controller
public class LoginController {

	@RequestMapping("/login")
	// @ResponseBody
	public String loginMessage() {
		return "login";
	}

}
