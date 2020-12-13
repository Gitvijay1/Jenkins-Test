package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/one")
	public String show() {
		return "WELCOME TO JENKINS JOB";
	}
	
	@GetMapping("/two")
	public String show1() {
		return "WELCOME TO JENKINS";
	}

}
