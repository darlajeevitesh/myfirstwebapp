package com.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private AuthenticationService authenticationService;

	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	private Logger logger = LoggerFactory.getLogger(getClass());

	// "login", method = RequestMethod.GET
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		logger.info("LoginController class :: login method");
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String welcome(@RequestParam String name, @RequestParam String password, ModelMap model) {
		logger.info("LoginController class :: login method");
		if (authenticationService.authenticate(name, password)) {
			model.put("name", name);
			return "welcome";
		}
		model.put("errorMessage", "Invalid Credentials, Please try again !");
		return "login";
	}

}
