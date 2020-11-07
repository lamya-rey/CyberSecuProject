package com.tp.spring.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tp.spring.bean.Adresse;
import com.tp.spring.dao.AdresseDao;
import com.tp.spring.service.fascade.AdresseService;

public class AdresseServiceImpl implements AdresseService {

	@Autowired
	public AdresseDao adresseDao;
	
	@Override
	public Adresse findByIdAdr(Long idAdr) {
		return adresseDao.findByIdAdr(idAdr);
	}

	@Override
	public int deletByIdAdr(Long idAdr) {
		return adresseDao.deleteByIdAdr(idAdr);
	}

	@Override
	public int save(Adresse adresse) {
		Adresse foundedAdresse = findByIdAdr(adresse.getIdAdr());
		if (foundedAdresse != null) {
			return -1;
		} else {
			adresseDao.save(adresse);
			return 1;
		}
	}

	@Override
	public int update(Adresse adresse) {
		Adresse foundedAdresse = findByIdAdr(adresse.getIdAdr());
		if(foundedAdresse==null) {
			return -1;
	}else {
		foundedAdresse.setLibelleAdr(adresse.getLibelleAdr());
		adresseDao.save(foundedAdresse);
		return 1;
	}	
	}

	@Override
	public List<Adresse> findAll() {
	     return adresseDao.findAll();
	}

}
