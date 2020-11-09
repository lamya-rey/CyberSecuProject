package com.tp.spring.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.spring.bean.Adresse;
import com.tp.spring.dao.AdresseDao;
import com.tp.spring.service.fascade.AdresseService;

@Service
public class AdresseServiceImpl implements AdresseService {

	@Autowired
	public AdresseDao adresseDao;

	@Override
	public Adresse findByIdAdr(Long idAdr) {
		return adresseDao.findByIdAdr(idAdr);
	}

	@Override
	public int deleteByIdAdr(Long idAdr) {
		Adresse foundedAdresse = findByIdAdr(idAdr);
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
		Adresse foundedAdresse = findByIdAdr(adresse.getIdAdr());
		if (foundedAdresse != null) {
			return -1;
		}else if (adresse.getLibelleAdr() == "" || adresse.getLibelleAdr() == null
				|| adresse.getVille() == "" || adresse.getVille() == null
				|| adresse.getPays() == "" || adresse.getPays() == null) {
			return -2;
		}
		 else {
			adresseDao.save(adresse);
			return 1;
		}
	}
	
	
	@Override
	public int update(Adresse adresse) {
		Adresse foundedAdresse = findByIdAdr(adresse.getIdAdr());
		if (foundedAdresse == null) {
			return -1;
		} else if (adresse.getLibelleAdr() == "" || adresse.getLibelleAdr() == null
				|| adresse.getVille() == "" || adresse.getVille() == null
				|| adresse.getPays() == "" || adresse.getPays() == null) {
			return -2;
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

}
