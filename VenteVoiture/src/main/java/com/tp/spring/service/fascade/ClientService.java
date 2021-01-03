package com.tp.spring.service.fascade;

import java.util.List;

import com.tp.spring.entity.Client;

public interface ClientService {
	
	public Client findById(Long id);
	
	public Client findByLogin(String login);

	public int deleteById(Long id);

	public int save(Client client);

	public int update(Client client);

	public List<Client> findAll();
	
	
}
