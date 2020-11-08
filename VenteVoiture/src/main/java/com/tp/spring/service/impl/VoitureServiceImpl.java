package com.tp.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tp.spring.bean.Client;
import com.tp.spring.bean.Voiture;
import com.tp.spring.dao.VoitureDao;
import com.tp.spring.service.fascade.VoitureService;

public class VoitureServiceImpl implements VoitureService {
	
	@Autowired
	public VoitureDao voitureDao;

	@Override
	public Voiture findByIdVoit(Long idVoit) {
		return voitureDao.findByIdVoit(idVoit);
	}

	@Override
	public int deleteByIdVoit(Long idVoit) {
		return voitureDao.deleteByIdVoit(idVoit);
	}

	@Override
	public List<Voiture> findByMarqueLibelleMarq(String libelleMarq) {
		return voitureDao.findByMarqueLibelleMarq(libelleMarq);
	}

	@Override
	public int save(Voiture voiture) {
		Voiture foundedVoiture = findByIdVoit(voiture.getIdVoit());
		if(foundedVoiture!=null) {
			return -1;
		}
		else {
			voitureDao.save(foundedVoiture);
			return 1;
		}
	}

	@Override
	public int update(Long idVoit) {
		Voiture foundedVoiture=findByIdVoit(idVoit);
		if(foundedVoiture==null) {
			return -1;
		}
		else if( foundedVoiture.getPrix() == null
		       || foundedVoiture.getKilometrage()== null
		    	|| foundedVoiture.getCouleur() == "" || foundedVoiture.getCouleur()== null 
			   || foundedVoiture.getMarque().getLibelleMarq() == "" || foundedVoiture.getMarque().getLibelleMarq()== null
			   || foundedVoiture.getClient().getIdCl()== null) {
			return -2;
			}
			else {
				voitureDao.save(foundedVoiture);
				return 1;
			}	
			}

	@Override
	public List<Voiture> findAll() {
		return voitureDao.findAll();
	}

}
