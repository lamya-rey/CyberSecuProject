package com.tp.spring.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tp.spring.entity.Voiture;

@Repository
public interface VoitureDao extends JpaRepository<Voiture, Long> {
	

	
	public Voiture findByClientLogin(String login);
	
	public List<Voiture> findByMarqueLibelle(String libelle);
	
}
