package com.tp.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tp.spring.bean.Adresse;
import com.tp.spring.bean.Concessionnaire;
import com.tp.spring.bean.Marque;
import com.tp.spring.dao.ConcessionnaireDao;
import com.tp.spring.service.fascade.AdresseService;
import com.tp.spring.service.fascade.ConcessionnaireService;
import com.tp.spring.service.fascade.MarqueService;

public class ConcessionnaireServiceImpl implements ConcessionnaireService {

	
	@Autowired
	public ConcessionnaireDao concessionnaireDao;
	
	@Autowired
	public AdresseService adresseService;
	
	@Autowired
	public MarqueService marqueService;
	
	@Override
	public Concessionnaire findByIdCons(Long idCons) {
		return concessionnaireDao.findByIdCons(idCons);
	}

	@Override
	public int deletByIdCons(Long idCons) {
		return concessionnaireDao.deleteByIdCons(idCons);
	}

	@Override
	public int save(Concessionnaire concessionnaire) {
		Concessionnaire foundedConcessionnaire = findByIdCons(concessionnaire.getIdCons());
		if (foundedConcessionnaire != null) {
			return -1;
		} else {
			concessionnaireDao.save(concessionnaire);
			return 1;
		}
	}

	@Override
	public int update(Concessionnaire concessionnaire) {
		Concessionnaire foundedConcessionnaire = findByIdCons(concessionnaire.getIdCons());
		if (foundedConcessionnaire == null) {
			return -1;
		} else {
			for (Adresse adresse : concessionnaire.getAdresses()) {
				adresseService.update(adresse);
			}
			for (Marque marque : concessionnaire.getMarques()) {
				marqueService.update(marque);
			}
			concessionnaireDao.save(foundedConcessionnaire);
			return 1;
		}
	}

	@Override
	public List<Concessionnaire> findAll() {
		return concessionnaireDao.findAll();
	}

}
