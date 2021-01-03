package com.tp.spring.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Concessionnaire {
	@Id
	private Long id ;
	private String libelle; 
	private String phone;
	
	
	
	@OneToMany
	private List<Adresse> adresses;
	
	@ManyToMany
	private List<Marque> marques; 
	
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

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public List<Adresse> getAdresses() {
		return adresses;
	}
	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}
	
	public List<Marque> getMarques() {
		return marques;
	}
	public void setMarques(List<Marque> marques) {
		this.marques = marques;
	} 
	public Concessionnaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Concessionnaire(Long id, String libelle, String phone, List<Adresse> adresses,
			List<Marque> marques) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.phone = phone;
		this.adresses = adresses;
		this.marques = marques;
	}
	@Override
	public String toString() {
		return "Concessionnaire [id=" + id + ", libelle=" + libelle + ", phone=" + phone
				+ ", adresses=" + adresses + ", marques=" + marques + "]";
	}
	
	
	
}
