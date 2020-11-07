package com.tp.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tp.spring.bean.Concessionnaire;

@Repository
public interface ConcessionnaireDao extends JpaRepository<Concessionnaire, Long>{
	
public Concessionnaire findByIdCons(Long idCons);
	
	public int deleteByIdCons(Long idCons);

}
