/**
 * 
 */
package com.czt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.czt.entity.User;
import com.czt.service.UserInterface;
import com.czt.service.UserService;

/**
 * 
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserInterface userService;

	// method for first rest service
	@GetMapping("/lookup")
	public String helloRestService() {

		return "My first REST Service-->BOA";
	}

	@GetMapping("/getAll")
	public List<User> getAllBooks() {
		return userService.getAllUsers();
	}

	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@GetMapping("/getUserById/{id}")
	public User getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}

	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
		return userService.updateUser(id, updatedUser);

	}

	/*
	 * @DeleteMapping("/delete/{id}") public boolean deleteUser(@PathVariable Long
	 * id) { return userService.deleteUser(id); }
	 */

}
