package com.tp.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tp.spring.entity.Adresse;

@Repository
public interface AdresseDao extends JpaRepository<Adresse, Long>{
	
public Adresse findByLibelle(String libelle);
	
	

}
