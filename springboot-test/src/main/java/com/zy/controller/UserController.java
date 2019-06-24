package com.zy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("user/{userName}")
	
	@GetMapping("user/{userName}")
	public User getUserByName(@PathVariable(value = "userName") String userName) {
		return this.userService.findByName(userName);
	}

	@PostMapping("user/save")
	public void saveUser(@RequestBody User user) {
		this.userService.saveUser(user);
	}

}
