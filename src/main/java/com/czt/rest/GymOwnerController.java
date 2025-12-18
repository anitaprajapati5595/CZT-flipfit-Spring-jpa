package com.czt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.czt.entity.GymCenter;
import com.czt.entity.User;
import com.czt.service.GymOwnerInterface;
import com.czt.service.GymOwnerService;
import com.czt.service.UserInterface;

@RestController
@RequestMapping("/gymOwner")
public class GymOwnerController {

	@Autowired
	private GymOwnerInterface gymOwnerInterface;

	@GetMapping("/lookup")
	public String helloRestService() {

		return "My first REST Service-->BOA";
	}

	@GetMapping("/getAllGymCenter")
	public List getAllGymCenter() {
		return gymOwnerInterface.getAllGymCenter();
	}

	@PostMapping("/addGymCenter")
	public GymCenter createUser(@RequestBody GymCenter gymCenter) {
		return gymOwnerInterface.addGymCenter(gymCenter);
	}
}
