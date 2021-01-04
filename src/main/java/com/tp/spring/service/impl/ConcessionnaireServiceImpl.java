package com.tp.spring.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.spring.dao.ConcessionnaireDao;
import com.tp.spring.entity.Adresse;
import com.tp.spring.entity.Concessionnaire;
import com.tp.spring.entity.Marque;
import com.tp.spring.service.fascade.AdresseService;
import com.tp.spring.service.fascade.ConcessionnaireService;
import com.tp.spring.service.fascade.MarqueService;

@Service
public class ConcessionnaireServiceImpl implements ConcessionnaireService {

	@Autowired
	public ConcessionnaireDao concessionnaireDao;

	@Autowired
	public AdresseService adresseService;

	@Autowired
	public MarqueService marqueService;

	@Override
	public Concessionnaire findById(Long id) {
		return concessionnaireDao.findById(id).orElse(null);
	}

	@Override
	public Concessionnaire findByLibelle(String libelle) {
		return concessionnaireDao.findByLibelle(libelle);
	}
	@Transactional
	@Override
	public int deleteById(Long id) {
		Concessionnaire foundedConcessionnaire = findById(id);
		if(foundedConcessionnaire == null) {
			return -1;
		}else {
			for(Adresse ad:foundedConcessionnaire.getAdresses()) {
				adresseService.deleteById(ad.getId());
			}
			concessionnaireDao.delete(foundedConcessionnaire);
			return 1;
		}
	}

	@Transactional
	@Override
	public int save(Concessionnaire concessionnaire) {
		Concessionnaire foundedConcessionnaire = findById(concessionnaire.getId());
		if (foundedConcessionnaire != null) {
			return -1;
		} 
		 else {
			
			if (concessionnaire.getAdresses().size() > 0) {
				List<Adresse>  adresses = new ArrayList<Adresse>();
				for (Adresse ad : concessionnaire.getAdresses()) {
					Adresse foundedA = adresseService.findById(ad.getId()); 
					if(foundedA != null) {
						adresses.add(ad);
					}else {
						if(adresseService.save(ad)>0) {
					adresses.add(foundedA);
				   }
				}
			}
					
				concessionnaire.setAdresses(adresses);
			}
			if(concessionnaire.getMarques().size()>0) {
				List<Marque> marques = new ArrayList<Marque>();
				for(Marque m : concessionnaire.getMarques()) {
					Marque foundedM = marqueService.findById(m.getId()); 
					if(foundedM != null) {
						marques.add(foundedM);
					}else {
						if(marqueService.save(m)>0) {
							marques.add(foundedM);
						}
					}
				}
				concessionnaire.setMarques(marques);
			}
			concessionnaireDao.save(concessionnaire);
			return 1;
		}
	}

	@Transactional
	@Override
	public int update(Concessionnaire concessionnaire) {
		Concessionnaire foundedConcessionnaire = findById(concessionnaire.getId());
		if (foundedConcessionnaire == null) {
			return -1;
		} else {
			for (Adresse adresse : foundedConcessionnaire.getAdresses()) {
				adresseService.update(adresse);
			}
			for (Marque marque : concessionnaire.getMarques()) {
				marqueService.update(marque);
			}
			concessionnaire.setId(foundedConcessionnaire.getId());
			concessionnaireDao.save(concessionnaire);
			return 1;
		}
	}

	@Override
	public List<Concessionnaire> findAll() {
		return concessionnaireDao.findAll();
	}

}
