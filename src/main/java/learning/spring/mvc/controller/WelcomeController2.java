package learning.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api2")
public class WelcomeController2 {

	
	@GetMapping("/")
	public String hello()
	{
		System.out.println("WelcomeController2.hello()");
		return "index11";
	}
	

	@RequestMapping("/welcome")
	public String greet()
	{
		System.out.println("WelcomeController2.greet()");
		return "welcome";
	}
	
	@RequestMapping("/admin")
	public String adminLogIn()
	{
		System.out.println("WelcomeController2.adminLogIn()");
		return "redirect:/welcome";
	}
	
	
}
