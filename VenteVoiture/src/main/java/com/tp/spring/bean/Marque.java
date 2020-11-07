package com.tp.spring.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marque {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private Long idMarq;
	private String libelleMarq;
	private String modele;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public Long getIdMarq() {
		return idMarq;
	}
	public void setIdMarq(Long idMarq) {
		this.idMarq = idMarq;
	}
	
	public String getLibelleMarq() {
		return libelleMarq;
	}
	public void setLibelleMarq(String libelleMarq) {
		this.libelleMarq = libelleMarq;
	}
	
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	
	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
