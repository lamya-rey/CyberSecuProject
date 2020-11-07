package com.tp.spring.service.fascade;

import java.util.List;

import com.tp.spring.bean.Marque;

public interface MarqueService {

public Marque findByIdMarq(Long idMarq);
	
	public int  deleteByIdMarq(Long idMarq);
	
	public int save(Marque marque);
	
	public Marque update(Marque marque);
	
	public List<Marque> findAll();

}
