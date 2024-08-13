package com.pica.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.pica.microservice.model.User;
import com.pica.microservice.repository.UserRepository;

@Controller
@RequestMapping(path="/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping(path="/")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	@PutMapping(path="/")
	public @ResponseBody User addNewUser(@RequestBody User user) {

		return userRepository.save(user);
	}

}
