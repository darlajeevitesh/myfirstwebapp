package com.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("login")
	public String login(@RequestParam String name, ModelMap model) {
		System.out.println("Request Parameter is : " +name);  //For Testing only not recommended for real world applications
		model.put("name", name);
		return "login";

	}

}
