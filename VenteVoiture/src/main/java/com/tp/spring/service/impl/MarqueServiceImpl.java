package com.tp.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tp.spring.bean.Adresse;
import com.tp.spring.bean.Marque;
import com.tp.spring.bean.Marque;
import com.tp.spring.dao.MarqueDao;
import com.tp.spring.service.fascade.MarqueService;

public class MarqueServiceImpl implements MarqueService{
	
	@Autowired
	public MarqueDao marqueDao;

	@Override
	public Marque findByIdMarq(Long idMarq) {
		return marqueDao.findByIdMarq(idMarq);
	}

	@Override
	public Marque findByLibelleMarq(String libelleMarq) {
		return marqueDao.findByLibelleMarq(libelleMarq);
	}

	@Override
	public int deleteByIdMarq(Long idMarq) {
		return marqueDao.deleteByIdMarq(idMarq);
	}

	@Override
	public int save(Marque marque) {
		Marque foundedMarque = findByLibelleMarq(marque.getLibelleMarq());
		if (foundedMarque != null) {
			return -1;
		} else {
			marqueDao.save(marque);
			return 1;
		}
	}

	@Override
	public int update(Long idMarq) {
		Marque foundedMarque = findByIdMarq(idMarq);
		if(foundedMarque==null) {
			return -1;
	}
		else if ( foundedMarque.getLibelleMarq() == "" || foundedMarque.getLibelleMarq()== null) {
	    
			return -2;
			}
	else {
		marqueDao.save(foundedMarque);
		return 1;
			}
		}

	@Override
	public List<Marque> findAll() {
		return marqueDao.findAll();
	}

}
