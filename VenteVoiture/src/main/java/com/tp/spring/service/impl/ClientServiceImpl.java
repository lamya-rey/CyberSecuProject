package com.tp.spring.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.spring.bean.Client;
import com.tp.spring.dao.ClientDao;
import com.tp.spring.service.fascade.ClientService;
import com.tp.spring.service.fascade.VoitureService;

@Service
public class ClientServiceImpl implements ClientService {

	
	@Autowired
	public ClientDao clientDao;
	
	@Autowired
	public VoitureService voitureService;
	
	@Override
	public Client findByIdCl(Long idCl) {
		return clientDao.findByIdCl(idCl);
	}
	
	@Transactional
	@Override
	public int deleteByIdCl(Long idCl) {
		Client foundedClient = findByIdCl(idCl);
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
		Client foundedClient = findByIdCl(client.getIdCl());
		
		if(foundedClient!=null) {
			return -1;
		}else if(client.getPhoneCl() == "" || client.getPhoneCl() == null
			       ||client.getPrenomCl() == "" || client.getPrenomCl()== null
			    	|| client.getNomCl() == "" || client.getNomCl()== null 
				   || client.getMailCl() == "" || client.getMailCl()== null) {
				return -2;
				}
		else {
		
			clientDao.save(client);
			return 1;
		}
	}

	@Override
	public int update(Client client) {
		Client foundedClient=findByIdCl(client.getIdCl());
		if(foundedClient==null) {
			return -1;
		}
		else if(client.getPhoneCl() == "" || client.getPhoneCl() == null
		       ||client.getPrenomCl() == "" || client.getPrenomCl()== null
		    	|| client.getNomCl() == "" || client.getNomCl()== null 
			   || client.getMailCl() == "" || client.getMailCl()== null) {
			return -2;
			}
			else {
				client.setIdCl(foundedClient.getIdCl());
				clientDao.save(client);
				return 1;
			}	
			}
		
	

	@Override
	public List<Client> findAll() {
		return clientDao.findAll();
	}



	

}
