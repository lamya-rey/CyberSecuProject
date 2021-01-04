package com.tp.spring.service.impl;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.spring.dao.MarqueDao;
import com.tp.spring.entity.Marque;
import com.tp.spring.entity.Voiture;
import com.tp.spring.service.fascade.MarqueService;
import com.tp.spring.service.fascade.VoitureService;
@Service
public class MarqueServiceImpl implements MarqueService {

	@Autowired
	private MarqueDao marqueDao;
	@Autowired
	private VoitureService voitureService;

	@Override
	public Marque findById(Long id) {
		return marqueDao.findById(id).orElse(null);
	}

	@Override
	public Marque findByLibelle(String libelle) {
		return marqueDao.findByLibelle(libelle);
	}
	@Transactional
	@Override
	public int deleteById(Long id) {
		Marque foundedMarque = findById(id);
		if(foundedMarque == null) {
			return -1;
		}else {
			List<Voiture> voitures = voitureService.findByMarqueLibelle(foundedMarque.getLibelle());
			for(Voiture v : voitures) {
				voitureService.deleteById(v.getId());
			}
			marqueDao.delete(foundedMarque);
			return 1;
		}
	}

	@Override
	public int save(Marque marque) {
		Marque foundedMarque = findByLibelle(marque.getLibelle());
		if (foundedMarque != null) {
			return -1;
		} else {
			marqueDao.save(marque);
			return 1;
		}
	}

	@Override
	public int update(Marque marque) {
		Marque foundedMarque = findById(marque.getId());
		if (foundedMarque == null) {
			return -1;
		} else {
			marque.setId(foundedMarque.getId());
			marqueDao.save(marque);
			return 1;
		}
	}

	@Override
	public List<Marque> findAll() {
		return marqueDao.findAll();
	}

}