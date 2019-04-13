package com.in28minutes.springboot.web.service;

import org.springframework.stereotype.Component;

//This is a spring bean
@Component
//@Service
public class LoginService implements LoginServiceInterface {

	@Override
	public boolean validateUser(String userID, String password) {
		return userID.equalsIgnoreCase("aurelius") && password.equalsIgnoreCase("77192806");
	}
}
