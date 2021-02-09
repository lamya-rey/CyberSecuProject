package com.tp.spring.service.fascade;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.tp.spring.dto.UserDto;

public interface UserService extends UserDetailsService{
	
	UserDto createUser(UserDto userDto);
	
	UserDto getUser(String email);
	
	UserDto getUserById(long userId);
	
	UserDto updateUser(long userId, UserDto userDto);
	
	void deleteUser(long userId);
	
	List<UserDto> getUsers();

}
