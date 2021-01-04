package com.tp.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tp.spring.entity.Concessionnaire;

@Repository
public interface ConcessionnaireDao extends JpaRepository<Concessionnaire, Long>{
	
public Concessionnaire findByLibelle(String libelle);
	
	

}
