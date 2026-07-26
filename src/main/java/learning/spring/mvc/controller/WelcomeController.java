package learning.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	
	@RequestMapping("/")
	public String hello()
	{
		System.out.println("WelcomeController.hello()");
		return "index11.jsp";
	}
	
	
}
