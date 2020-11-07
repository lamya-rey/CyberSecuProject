package com.tp.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tp.spring.bean.Client;
import com.tp.spring.dao.ClientDao;
import com.tp.spring.service.fascade.ClientService;

public class ClientServiceImpl implements ClientService {

	
	@Autowired
	public ClientDao clientDao;
	
	@Override
	public Client findByIdCl(Long idCl) {
		return clientDao.findByIdCl(idCl);
	}

	@Override
	public int deletByIdCl(Long idCl) {
		return clientDao.deletByIdCl(idCl);
	}

	@Override
	public int save(Client client) {
		Client foundedClient = findByIdCl(client.getIdCl());
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
		Client foundedClient=findByIdCl(client.getIdCl());
		if(foundedClient!=null) {
			return -1;
		}
		else {
			client.setPrenomCl(client.getPrenomCl());
			client.setNomCl(client.getNomCl());
			client.setPhoneCl(client.getPhoneCl());
			client.setMailCl(client.getMailCl());
			clientDao.save(foundedClient);
			return 1;
		}
	}

	@Override
	public List<Client> findAll() {
		return clientDao.findAll();
	}

}
