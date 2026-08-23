package learning.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import learning.spring.mvc.model.User;
import learning.spring.mvc.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/signup")
	public String showSignupForm(Model model) {

		model.addAttribute("user", new User());

		return "signup";
	}

	@GetMapping("/login")
	public String showLogInForm(Model model) {
		System.out.println("UserController.showLogInForm()");
		return "login";
	}

	@PostMapping("/login")
	@ResponseBody
	public User loginUser(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {

		System.out.println("UserController.registerUserByRequestParam()");
		User validateUser = userService.validateUser(username, password);
		System.out.println(validateUser);
		model.addAttribute("user", validateUser);
		if (validateUser != null) {
			return validateUser;
		} else {
			return null;
		}
	}

	@PostMapping("/signup")
	public String registerUserByModelAttribute(@ModelAttribute("user") User user) {

		userService.addUser(user);
		System.out.println(user);

		return "admin";
	}
}