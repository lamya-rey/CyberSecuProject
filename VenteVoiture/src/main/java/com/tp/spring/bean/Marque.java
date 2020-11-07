package com.tp.spring.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Marque {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private Long idMarq;
	private String libelleMarq;
	private String modele;
	
	@ManyToMany
	private List<Concessionnaire> concessionnaires;
	
	
	
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
	public List<Concessionnaire> getConcessionnaires() {
		return concessionnaires;
	}
	public void setConcessionnaires(List<Concessionnaire> concessionnaires) {
		this.concessionnaires = concessionnaires;
	}
	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
