package com.aws.phase5finalproject.controllers;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/welcome")
	public String sayHello() {
		
		return "Hello World. We are learning AWS. Time on server is: "+LocalDateTime.now();
	}

}
