package learning.spring.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import learning.spring.mvc.model.User;
import learning.spring.mvc.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@ResponseBody
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {

		userService.addUser(user);
		return user;
	}

	@ResponseBody
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable(name = "id") int id) {
		return userService.validateUser(id);
	}
	
	
	@ResponseBody
	@GetMapping("/getAllUsers")
	public Map<Integer, User> getAllUsers() {
		return userService.getAllUsers();
	}

}