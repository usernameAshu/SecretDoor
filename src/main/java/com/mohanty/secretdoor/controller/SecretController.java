package com.mohanty.secretdoor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mohanty.secretdoor.exception.SecretAppException;
import com.mohanty.secretdoor.response.SecretDoorResponse;

@RestController
@RequestMapping(path = "/secret/door")
public class SecretController {

	private String message = "Door can be opened now";
	private String secretCode = "mango" ;
	@GetMapping
	public SecretDoorResponse openSecretDoor(@RequestParam(name = "code") String code) throws Exception {

		if (!code.equalsIgnoreCase(secretCode)) {
			throw new SecretAppException("Door cannot be opened" ,
						"It's a fruit's name", 
						"If unable to login please contact support team");
		}

		return new SecretDoorResponse(message);

	}
}
