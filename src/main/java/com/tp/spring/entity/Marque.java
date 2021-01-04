package com.tp.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Marque {
	@Id
	private Long id;
	private String libelle;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Marque(Long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Marque [id=" + id + ", libelle=" + libelle + "]";
	}
	
}