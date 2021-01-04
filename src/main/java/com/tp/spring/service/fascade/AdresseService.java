package com.tp.spring.service.fascade;

import java.util.List;

import com.tp.spring.entity.Adresse;

public interface AdresseService {
   
	public Adresse findByLibelle(String libelle);
	
    public Adresse findById(Long id);
	
	public int deleteById(Long id);
	
	public int save(Adresse adresse);
	
	public int update(Adresse adresse);
	
	public List<Adresse> findAll();

}
