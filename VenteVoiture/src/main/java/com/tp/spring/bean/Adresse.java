package com.tp.spring.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adresse {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long idAdr;
	private String libelleAdr;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getIdAdr() {
		return idAdr;
	}
	public void setIdAdr(Long idAdr) {
		this.idAdr = idAdr;
	}
	public String getLibelleAdr() {
		return libelleAdr;
	}
	public void setLibelleAdr(String libelleAdr) {
		this.libelleAdr = libelleAdr;
	}
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	

}
