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
	public Concessionnaire findByLibelleCons(String libelleCons) {
		return concessionnaireDao.findByLibelleCons(libelleCons);
	}

	@Override
	public int deleteByLibelleCons(String libelleCons) {
		return concessionnaireDao.deleteByLibelleCons(libelleCons);
	}
   
	@Override
	public int save(Concessionnaire concessionnaire) {
		Concessionnaire foundedConcessionnaire = findByLibelleCons(concessionnaire.getLibelleCons());
		if (foundedConcessionnaire != null) {
			return -1;
		} else {
			concessionnaireDao.save(concessionnaire);
			return 1;
		}
	}

	@Override
	public int update(Long idCons) {
		Concessionnaire foundedConcessionnaire = findByIdCons(idCons);
		if (foundedConcessionnaire == null) {
			return -1;
		} else if ( foundedConcessionnaire.getLibelleCons() == "" || foundedConcessionnaire.getLibelleCons()== null
	            ||  foundedConcessionnaire.getPhoneCons()== 0
              	||  foundedConcessionnaire.getAdresses()== null) {
			return -2;
			}
		/*else {
			for (Adresse adresse : foundedConcessionnaire.getAdresses()) {
				adresseService.update(adresse);
			}/*
			for (Marque marque : concessionnaire.getMarques()) {
				marqueService.update(marque);
			}*/
		else {	concessionnaireDao.save(foundedConcessionnaire);
			return 1;
			}
		}


	@Override
	public List<Concessionnaire> findAll() {
		return concessionnaireDao.findAll();
	}

	

	

}
