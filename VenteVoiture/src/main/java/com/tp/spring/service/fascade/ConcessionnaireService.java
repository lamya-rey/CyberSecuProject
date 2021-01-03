package com.tp.spring.service.fascade;

import java.util.List;

import com.tp.spring.entity.Concessionnaire;

public interface ConcessionnaireService {
	
public Concessionnaire findById(Long id);
	
    public Concessionnaire findByLibelle(String libelle);
	
	public int deleteById(Long id);
	
	public int save(Concessionnaire concessionnaire);
	
	public int update(Concessionnaire concessionnaire);
	
	public List<Concessionnaire> findAll();

}
