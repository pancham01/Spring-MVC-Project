package learning.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String hello() {
		System.out.println("WelcomeController.hello()");
		return "index11";
	}

	@RequestMapping("/getData")
	@ResponseBody
	public String queryParameter(@RequestParam(name = "user", defaultValue = "deafult-User") String username) {
		System.out.println("Welcome Mr." + username);
		return "Welcome Mr." + username;
	}

	@RequestMapping("/getUser/{id}")
	@ResponseBody
	public String getUserById(@PathVariable(name = "id") Long id) {
		System.out.println("WelcomeController.getUserById : " + id);
		return "Hi Mr. This is your Profile information and your User id is : " + id;
	}

}
