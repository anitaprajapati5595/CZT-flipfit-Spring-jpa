/**
 * 
 */
package com.czt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.czt.entity.User;

/**
 * 
 */
public interface UserRepository extends JpaRepository<User, Long> {

	// Derived query method
	User findByUserNameAndRole(String userName, String role);

	boolean existsByUserId(Long id);

	boolean deleteByUserId(Long id);

	User findByUserNameAndPasswordAndRole(String userName, String password, String role);

}
