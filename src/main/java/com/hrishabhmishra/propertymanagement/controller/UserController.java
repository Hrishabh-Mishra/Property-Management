package com.hrishabhmishra.propertymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrishabhmishra.propertymanagement.dto.UserDTO;
import com.hrishabhmishra.propertymanagement.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<UserDTO> register(@RequestBody UserDTO userDTO) {
		userDTO = userService.register(userDTO);
		return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
	}
	
	
	public UserDTO login(String email, String password) {
		return null;
	}
}
