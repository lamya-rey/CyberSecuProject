package com.tp.spring.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.spring.dao.AdresseDao;
import com.tp.spring.entity.Adresse;
import com.tp.spring.service.fascade.AdresseService;

@Service
public class AdresseServiceImpl implements AdresseService {

	@Autowired
	public AdresseDao adresseDao;

	@Override
	public Adresse findById(Long id) {
		return adresseDao.findById(id).orElse(null);
	}

	@Override
	public int deleteById(Long id) {
		Adresse foundedAdresse = findById(id);
		if(foundedAdresse == null) {
			return -1;
		}
		else {
			adresseDao.delete(foundedAdresse);
			return 1;
		}
	}

	
	@Override
	public int save(Adresse adresse) {
		Adresse foundedAdresse = findById(adresse.getId());
		if (foundedAdresse != null) {
			return -1;
		}
		 else {
			adresseDao.save(adresse);
			return 1;
		}
	}
	
	
	@Override
	public int update(Adresse adresse) {
		Adresse foundedAdresse = findById(adresse.getId());
		if (foundedAdresse == null) {
			return -1;
		} else {
			adresse.setId(foundedAdresse.getId());
			adresseDao.save(adresse);
			return 1;
		}
	}

	@Override
	public List<Adresse> findAll() {
		return adresseDao.findAll();
	}

	@Override
	public Adresse findByLibelle(String libelle) {
		return adresseDao.findByLibelle(libelle);
	
	}

}
