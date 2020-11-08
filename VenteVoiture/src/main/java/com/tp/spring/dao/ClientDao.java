package com.tp.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tp.spring.bean.Client;
import com.tp.spring.bean.Voiture;

@Repository
public interface ClientDao extends JpaRepository<Client, Long>{

	public Client findByIdCl(Long idCl);
	
	//public Client findByVoitures(List<Voiture> voitures);
	
	public int deleteByIdCl(Long idCl);
}
