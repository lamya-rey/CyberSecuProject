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
	private String libelle;
	
	
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
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
