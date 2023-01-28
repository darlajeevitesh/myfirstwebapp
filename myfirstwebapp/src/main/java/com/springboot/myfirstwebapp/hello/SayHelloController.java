package com.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello!";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("<html>"
				+ "<head>"
				+ "<title>"
				+ "Say Hello Html"
				+ "</title>"
				+ "<body>"
				+ "First Web App"
				+ "</body>"
				+ "</head>"
				+ "</html>");
		
		return sb.toString();
	}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}

}
