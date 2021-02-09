package com.tp.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tp.spring.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
	User findByEmail(String email);

}
