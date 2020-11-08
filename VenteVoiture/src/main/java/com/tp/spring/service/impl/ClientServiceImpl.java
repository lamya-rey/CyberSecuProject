package com.tp.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tp.spring.bean.Client;
import com.tp.spring.bean.Voiture;
import com.tp.spring.dao.ClientDao;
import com.tp.spring.service.fascade.ClientService;
import com.tp.spring.service.fascade.VoitureService;

public class ClientServiceImpl implements ClientService {

	
	@Autowired
	public ClientDao clientDao;
	
	@Autowired
	public VoitureService voitureService;
	
	@Override
	public Client findByIdCl(Long idCl) {
		return clientDao.findByIdCl(idCl);
	}
	/*
	@Override
	public Client findByVoitures(List<Voiture> voitures) {
		return clientDao.findByVoitures(voitures);
	}*/

	@Override
	public int deleteByIdCl(Long idCl) {
		return clientDao.deleteByIdCl(idCl);
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
	public int update(Long idCl) {
		Client foundedClient=findByIdCl(idCl);
		if(foundedClient==null) {
			return -1;
		}
		else if(foundedClient.getPhoneCl() == "" || foundedClient.getPhoneCl() == null
		       ||foundedClient.getPrenomCl() == "" || foundedClient.getPrenomCl()== null
		    	|| foundedClient.getNomCl() == "" || foundedClient.getNomCl()== null 
			   || foundedClient.getMailCl() == "" || foundedClient.getMailCl()== null) {
			return -2;
			}
			else {
				clientDao.save(foundedClient);
				return 1;
			}	
			}
		
	

	@Override
	public List<Client> findAll() {
		return clientDao.findAll();
	}



	

}
