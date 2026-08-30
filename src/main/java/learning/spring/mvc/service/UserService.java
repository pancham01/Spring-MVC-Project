package learning.spring.mvc.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import learning.spring.mvc.model.User;

@Service
public class UserService {

	Map<Integer, User> allUsers = new HashMap<>();

	public void addUser(User user) {
		allUsers.put(user.getId(), user);

	}

	public User validateUser(int id) {

		return allUsers.get(id);
	}

	public Map<Integer, User> getAllUsers() {
		return allUsers;
	}

}
