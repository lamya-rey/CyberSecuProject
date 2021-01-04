package com.tp.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.spring.dao.VoitureDao;
import com.tp.spring.entity.Client;
import com.tp.spring.entity.Marque;
import com.tp.spring.entity.Voiture;
import com.tp.spring.service.fascade.ClientService;
import com.tp.spring.service.fascade.MarqueService;
import com.tp.spring.service.fascade.VoitureService;

@Service
public class VoitureServiceImpl implements VoitureService {

	@Autowired
	public VoitureDao voitureDao;
	@Autowired
	public MarqueService marqueService;
	@Autowired
	public ClientService clientService;
	
	@Override
	public Voiture findById(Long id) {
		return voitureDao.findById(id).orElse(null);
	}

	@Override
	public Voiture findByClientLogin(String login) {
		return voitureDao.findByClientLogin(login);
	}
	
	@Override
	public int deleteById(Long id) {
		Voiture foundedVoiture = findById(id);
		if(foundedVoiture == null) {
			return -1;
		}else {
			voitureDao.delete(foundedVoiture);
			return 1;
		}
	}

	@Override
	public List<Voiture> findByMarqueLibelle(String libelle) {
		return voitureDao.findByMarqueLibelle(libelle);
	}

	@Override
	public int save(Voiture voiture) {
		Voiture foundedVoiture = findById(voiture.getId());
		Marque marque = marqueService.findById(voiture.getMarque().getId());
		Client client = clientService.findById(voiture.getClient().getId());
		if (foundedVoiture != null || marque == null || client == null) {
			return -1;
		
		} else {
			voiture.setClient(client);
			voiture.setMarque(marque);
			voitureDao.save(voiture);
			return 1;
		}
	}

	@Override
	public int update(Voiture voiture) {
		Voiture foundedVoiture = findById(voiture.getId());
		if (foundedVoiture == null) {
			return -1;
		} else {
			voiture.setClient(clientService.findById(voiture.getClient().getId()));
			voiture.setMarque(marqueService.findById(voiture.getMarque().getId()));
			voiture.setId(foundedVoiture.getId());
			voitureDao.save(voiture);
			return 1;
		}
	}

	@Override
	public List<Voiture> findAll() {
		return voitureDao.findAll();
	}


}