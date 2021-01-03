package com.tp.spring.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.spring.dao.ClientDao;
import com.tp.spring.entity.Client;
import com.tp.spring.service.fascade.ClientService;
import com.tp.spring.service.fascade.VoitureService;

@Service
public class ClientServiceImpl implements ClientService {

	
	@Autowired
	public ClientDao clientDao;
	
	@Autowired
	public VoitureService voitureService;
	
	@Override
	public Client findById(Long id) {
		return clientDao.findById(id).orElse(null);
	}
	
	@Transactional
	@Override
	public int deleteById(Long id) {
		Client foundedClient = findById(id);
		if(foundedClient == null) {
			return -1;
		}
		else {
			clientDao.delete(foundedClient);
			return 1;
		}
	}

	@Override
	public int save(Client client) {
		Client foundedClient = findById(client.getId());
		
		if(foundedClient!=null) {
			return -1;
		}
		else {
		
			clientDao.save(client);
			return 1;
		}
	}

	@Override
	public int update(Client client) {
		Client foundedClient=findById(client.getId());
		if(foundedClient==null) {
			return -1;
		}
			else {
				client.setId(foundedClient.getId());
				clientDao.save(client);
				return 1;
			}	
			}
		
	

	@Override
	public List<Client> findAll() {
		return clientDao.findAll();
	}

	@Override
	public Client findByLogin(String login) {
		return clientDao.findByLogin(login);
	}



	

}
