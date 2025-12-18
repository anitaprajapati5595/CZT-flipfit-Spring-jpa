/**
 * 
 */
package com.czt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.czt.service.GymCustomerService;

/**
 * 
 */
@RestController
@RequestMapping("/api/gymCustomer")
public class GymCustomerController {
	
	/*@Autowired
	private GymCustomerService gymCustomerServicel;*/
	
	// method for first rest service
		@GetMapping("/lookup")
		public String helloRestService() {

			return "My first REST Service-->BOA";
		}

}
