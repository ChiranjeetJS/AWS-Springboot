package com.example.AWSSpringboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/AWS")
public class AWSController {

	
	@GetMapping("/message")
	public String message() {
		return "Getting started with AWS!";
	}
}
