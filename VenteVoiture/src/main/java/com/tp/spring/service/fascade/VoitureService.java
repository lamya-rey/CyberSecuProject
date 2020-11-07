package com.tp.spring.service.fascade;

import java.util.List;

import com.tp.spring.bean.Voiture;

public interface VoitureService {

public Voiture findByIdVoit(Long idVoit);
	
	public int deletByIdVoit(Long idVoit);
	
	public List<Voiture> findByMarqueLibelleMarq(String libelleMarq);
	
	public int save(Voiture voiture);
	
	public Voiture update(Voiture voiture);
	
	
	public List<Voiture> findAll();
}
