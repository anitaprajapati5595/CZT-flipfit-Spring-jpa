/**
 * 
 */
package com.czt.service;

import java.util.List;

import com.czt.entity.User;

/**
 * 
 */
public interface UserInterface {

	List<User> getAllUsers();

	User createUser(User user);

	User getUserById(Long id);

	User updateUser(Long id, User updatedUser);

}
