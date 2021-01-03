package com.tp.spring.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tp.spring.entity.Client;


@Repository
public interface ClientDao extends JpaRepository<Client, Long>{

	public Client findByLogin(String login);
	
	
	
	
}
