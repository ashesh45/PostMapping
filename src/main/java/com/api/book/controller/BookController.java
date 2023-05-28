package com.api.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.book.services.UserService;

public class BookController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public ResponseEntity<User> CreateUser(@RequestBody User user){
		
	}

}
