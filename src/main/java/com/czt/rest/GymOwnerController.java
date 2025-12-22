package com.czt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.czt.entity.GymCenter;
import com.czt.helper.CommonAuthentication;
import com.czt.service.GymOwnerInterface;
import com.czt.service.UserInterface;

@RestController
@RequestMapping("/gymOwner")
public class GymOwnerController {

	@Autowired
	private GymOwnerInterface gymOwnerInterface;

	@Autowired
	private CommonAuthentication commonAuthentication;

	private final String role = "Owner";

	@Autowired
	private UserInterface userService;

	@GetMapping("/lookup")
	public String helloRestService() {

		return "My first REST Service-->BOA";
	}

	@GetMapping("/getAllGymCenter")
	public ResponseEntity<?> getAllGymCenter(@RequestHeader String username, @RequestHeader String password) {
		// ✅ Step 2: Verify credentials
		if (commonAuthentication.authenticate(username, password, role)) {
			// ✅ Step 3: Return gym data
			return ResponseEntity.ok(gymOwnerInterface.getAllGymCenter());
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
		}
	}

	@PostMapping("/addGymCenter")
	public ResponseEntity<?> createUser(@RequestHeader String username, @RequestHeader String password,
			@RequestBody GymCenter gymCenter) {
		if (commonAuthentication.authenticate(username, password, role)) {
			return ResponseEntity.ok(gymOwnerInterface.addGymCenter(gymCenter));
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
		}
	}
	
	@PutMapping("/updateGymCenter/{id}")
	public ResponseEntity<?> updateUser(@RequestHeader String username, @RequestHeader String password,
			@PathVariable Long id, @RequestBody GymCenter updatedUser) {
		if (commonAuthentication.authenticate(username, password, role)) {
			// ✅ Step 3: Return gym data
			return ResponseEntity.ok(gymOwnerInterface.updateymCenter(id, updatedUser));
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
		}

	}


}
