package learning.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import learning.spring.mvc.model.User;

@Controller
public class UserController {

	@GetMapping("/signup")
	public String showSignupForm(Model model) {

		model.addAttribute("user", new User());

		return "signup";
	}

	@PostMapping("/signup")
	public String registerUserByRequestParam(HttpServletRequest request) {
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String address = request.getParameter("address");

		User user = new User();
		user.setUsername(username);
		user.setGender(gender);
		user.setAge(Integer.parseInt(age));
		user.setPassword(password);
		user.setEmail(email);
		user.setAddress(address);

		System.out.println(user);

		System.out.println("Name is: " + username);
		System.out.println("Password is: " + password);
		System.out.println("Age is: " + age);
		System.out.println("Gender is: " + gender);
		System.out.println("email is: " + email);
		System.out.println("Address is: " + address);

		return "admin";
	}

//	@PostMapping("/signup")
//	public String registerUserByRequestParam(@RequestParam("username") String username,
//			@RequestParam("password") String password, @RequestParam("gender") String gender,
//			@RequestParam("age") int age, @RequestParam("email") String email,
//			@RequestParam("address") String address) {
//
//		User user = new User();
//		user.setUsername(username);
//		user.setGender(gender);
//		user.setAge(age);
//		user.setPassword(password);
//		user.setEmail(email);
//		user.setAddress(address);
//		
//		System.out.println(user);
//
//		System.out.println("Name is: " + username);
//		System.out.println("Password is: " + password);
//		System.out.println("Age is: " + age);
//		System.out.println("Gender is: " + gender);
//		System.out.println("email is: " + email);
//		System.out.println("Address is: " + address);
//
//		return "admin";
//	}

//	@PostMapping("/signup")
//	public String registerUserByModelAttribute(@ModelAttribute("user") User user) {
//
//		System.out.println(user);
//		
//		return "admin";
//	}
}