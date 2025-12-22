/**
 * 
 */
package com.czt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.czt.entity.User;
import com.czt.repository.UserRepository;
import com.dao.exception.UserAlreadyExistsException;

import jakarta.jws.soap.SOAPBinding.Use;

/**
 * 
 */
@Service
public class UserService implements UserInterface {

	private final UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User createUser(User user) {
		User existingUser = userRepository.findByUserNameAndRole(user.getUserName(), user.getRole());

		if (existingUser != null) {
			throw new UserAlreadyExistsException(
					"User with name '" + user.getUserName() + "' and role '" + user.getRole() + "' already exists.");
		} else {
			// User does not exist → save new user
			return userRepository.save(user);
		}
	}

	public User getUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	public User updateUser(Long id, User updatedUser) {
		if (userRepository.existsByUserId(id)) {
			updatedUser.setUserId(id);
			return userRepository.save(updatedUser);
		}
		return null;
	}

	public boolean deleteUser(Long id) {
		return userRepository.deleteByUserId(id);
	}

	public boolean verifyUser(String userName, String password, String role) {
		User existingUser = userRepository.findByUserNameAndPasswordAndRole(userName, password,role);

		if (existingUser != null) {
			return true;
		} else {
			return false;
		}
	}

}
