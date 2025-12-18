package com.czt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.czt.service.GymAdminInterface;
import com.czt.service.GymAdminService;

@RestController
@RequestMapping("/api/gymAdmin")
public class GymAdminController {

	@Autowired(required = true)
	private GymAdminInterface gymAdminService;

	// method for first rest service
	@GetMapping("/lookup")
	public String helloRestService() {

		return "My first REST Service-->BOA";
	}

}
