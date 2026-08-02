package learning.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api1")
public class WelcomeController {

	
	@RequestMapping("/")
	public String hello()
	{
		System.out.println("WelcomeController.hello()");
		return "index11";
	}
	

	@RequestMapping("/welcome")
	public String greet()
	{
		System.out.println("WelcomeController.greet()");
		return "welcome";
	}
	
	@RequestMapping("/admin")
	public String adminLogIn()
	{
		System.out.println("WelcomeController.adminLogIn()");
		return "redirect:/welcome";
	}
	
	
}
