package com.example.validator;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.entity.UserEntity;

@Service
public class UserValidator {

	public void validate(Map<String, String> requestHeader, UserEntity user) throws Exception {

		// validate header

		// validate body
		if (user == null) {
			throw new Exception("Please provide the details.");
		}
		if (user.getAge() != null) {
			// further validations
		}

	}

}
