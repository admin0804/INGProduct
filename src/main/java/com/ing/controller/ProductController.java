package com.ing.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class ProductController {
	
	public static final String WELCOME = "Welcome to ING Product Applications";
	
	@GetMapping("/overview")
	public ResponseEntity<String> welcomeMessage(){
		return new ResponseEntity<>(WELCOME,HttpStatus.OK);
	}

}
