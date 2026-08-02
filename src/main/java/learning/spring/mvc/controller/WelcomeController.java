package learning.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api1")
public class WelcomeController {

	@GetMapping("/")
	public String hello() {
		System.out.println("WelcomeController.hello()");
		return "index11";
	}

//	@RequestMapping(value = { "/welcome", "/hello" }, method = RequestMethod.GET)
	@GetMapping(value = { "/welcome", "/hello" })
	public String greet() {
		System.out.println("WelcomeController.greet()");
		return "welcome";
	}

	@GetMapping("/admin")
	public String adminLogIn() {
		System.out.println("WelcomeController.adminLogIn()");
		return "redirect:/welcome";
	}

}
