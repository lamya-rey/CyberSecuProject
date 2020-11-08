package com.tp.spring.service.fascade;

import java.util.List;

import com.tp.spring.bean.Client;
import com.tp.spring.bean.Voiture;

public interface ClientService {

    public Client findByIdCl(Long idCl);
    
  //  public Client findByVoitures(List<Voiture> voitures);
	
	public int deleteByIdCl(Long idCl);
	
	public int save(Client client);
	
	public int update(Long idCl);
	
	public List<Client> findAll();
	
	
}
