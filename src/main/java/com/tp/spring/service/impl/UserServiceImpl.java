package com.tp.spring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tp.spring.dao.UserDao;
import com.tp.spring.dto.UserDto;
import com.tp.spring.entity.User;
import com.tp.spring.service.fascade.UserService;

import javassist.NotFoundException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public UserDto createUser(UserDto userDto) {
		User checkUser = userDao.findByEmail(userDto.getEmail());
		if(checkUser != null) {
			throw new RuntimeException("user already exist");
		}
		User userEntity = new User();
		BeanUtils.copyProperties(userDto, userEntity);
		userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
		User newUser = userDao.save(userEntity);
		UserDto user = new UserDto();
		BeanUtils.copyProperties(newUser, user);
		return user;
	}

	@Override
	public UserDto getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(long userId) {
		User user = userDao.findById(userId).orElseThrow(() -> new UsernameNotFoundException("user id :"+userId + " not found"));
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(user, userDto);
		return userDto;
	}

	@Override
	public UserDto updateUser(long userId, UserDto userDto) {
		User user = userDao.findById(userId).orElseThrow(() -> new UsernameNotFoundException("user id :"+userId + " not found"));
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setEmail(userDto.getEmail());
		userDao.save(user);
		UserDto userResult = new UserDto();
		BeanUtils.copyProperties(user, userResult);
		return userResult;
	}

	@Override
	public void deleteUser(long userId) {
		User user = userDao.findById(userId).orElseThrow(() -> new UsernameNotFoundException("user id :"+userId + " not found"));
		userDao.delete(user);

	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userDao.findByEmail(email);
		if(user == null) {
			throw new UsernameNotFoundException(email);
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getEncryptedPassword(), new ArrayList<>());
	}

	@Override
	public List<UserDto> getUsers() {
		List<User> users = (List<User>) userDao.findAll();
		List<UserDto> usersDto = new ArrayList<UserDto>();
        for (User user : users) {
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(user, userDto);
            usersDto.add(userDto);
        }
		return usersDto;
	}

}
