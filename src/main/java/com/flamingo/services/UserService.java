package com.flamingo.services;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.flamingo.model.User;
import com.flamingo.service.impl.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	
	User findByEmail(String email);
	
	Optional<User> findByUsername(String username);
	
	User save(User userDto);
//	User save(UserRegistrationDto userDto);
}
