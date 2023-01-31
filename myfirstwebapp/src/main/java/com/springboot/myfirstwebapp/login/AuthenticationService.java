package com.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		boolean isUserNameValid = username.equalsIgnoreCase("Username");
		boolean isPasswordValid = password.equalsIgnoreCase("dummy");
		
		return isUserNameValid && isPasswordValid;
	}

}
