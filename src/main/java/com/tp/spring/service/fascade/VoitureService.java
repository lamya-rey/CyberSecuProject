package com.tp.spring.service.fascade;

import java.util.List;

import com.tp.spring.entity.Voiture;

public interface VoitureService {

	public Voiture findById(Long id);
	
	public Voiture findByClientLogin(String login);

	public int deleteById(Long id);

	public List<Voiture> findByMarqueLibelle(String libelle);

	public int save(Voiture voiture);

	public int update(Voiture voiture);

	public List<Voiture> findAll();

}
