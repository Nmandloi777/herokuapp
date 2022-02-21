package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.UserEntity;
import com.example.service.UserService;
import com.example.validator.UserValidator;

/**
 * @author Nishika Mandloi
 *
 */
@RestController
@RequestMapping(path = "/api/v1/users")
public class UserController {

	@Autowired
	UserValidator userValidator;

	@Autowired
	UserService userService;

	/**
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@PostMapping
	public UserEntity saveUser(@RequestHeader Map<String, String> requestHeader, @RequestBody UserEntity user)
			throws Exception {
		userValidator.validate(requestHeader, user);
		return userService.save(user);
	}
}
