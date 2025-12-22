package com.czt.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czt.service.UserInterface;

@Service
public class CommonAuthentication {

	@Autowired
	private UserInterface userService;

	public boolean authenticate(String username, String password, String role) {
		return userService.verifyUser(username, password, role);
	}

}
