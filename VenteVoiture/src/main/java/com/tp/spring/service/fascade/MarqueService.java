package com.tp.spring.service.fascade;

import java.util.List;

import com.tp.spring.entity.Marque;

public interface MarqueService {

	public Marque findById(Long id);

    public Marque findByLibelle(String libelle);
	
	public int  deleteById(Long id);
	
	public int save(Marque marque);
	
	public int update(Marque marque);
	
	public List<Marque> findAll();

}
