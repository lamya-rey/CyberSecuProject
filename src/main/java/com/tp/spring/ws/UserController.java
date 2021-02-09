package com.tp.spring.ws;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.RespectBinding;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp.spring.dto.UserDto;
import com.tp.spring.entity.User;
import com.tp.spring.request.UserRequest;
import com.tp.spring.response.UserResponse;
import com.tp.spring.service.fascade.UserService;


@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/{id}")
	public UserResponse getUser(@PathVariable long id) {
		
		UserDto userDto = userService.getUserById(id);
		UserResponse userResponse = new UserResponse();
		BeanUtils.copyProperties(userDto, userResponse);
		return userResponse;
		
	}
	
	@GetMapping
	public List<UserResponse> getUsers() {
		
		List<UserDto> users = userService.getUsers();
		List<UserResponse> usersResult = new ArrayList<UserResponse>();
        for (UserDto user : users) {
        	UserResponse userResult = new UserResponse();
            BeanUtils.copyProperties(user, userResult);
            usersResult.add(userResult);
        }
		return usersResult;
		
	}
	
	@PostMapping
	public UserResponse createUser(@RequestBody UserRequest userRequest) {
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userRequest, userDto);
		UserDto createUser = userService.createUser(userDto);
		UserResponse userResponse = new UserResponse();
		BeanUtils.copyProperties(createUser, userResponse);
		return userResponse;
	}
	
	@PutMapping("/{id}")
	public UserResponse UpdateUser(@PathVariable long id, @RequestBody UserRequest userRequest) {
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userRequest, userDto);
		UserDto updateUser = userService.updateUser(id, userDto);
		UserResponse userResponse = new UserResponse();
		BeanUtils.copyProperties(updateUser, userResponse);
		return userResponse;
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable long id) {
		userService.deleteUser(id);
		return "user deleted";
	}
}
