package com.tp.spring.bean;

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
	private Long idCons ;
	private String libelleCons; 
	private String phoneCons;
	
	// i removed mapped by because i didn't put the relation in adress entity it gives an error
	@OneToMany
	private List<Adresse> adresses;
	
	@ManyToMany
	private List<Marque> marques; 
	
	public Long getIdCons() {
		return idCons;
	}
	public void setIdCons(Long idCons) {
		this.idCons = idCons;
	}
	public String getLibelleCons() {
		return libelleCons;
	}
	public void setLibelleCons(String libelleCons) {
		this.libelleCons = libelleCons;
	}

	public String getPhoneCons() {
		return phoneCons;
	}
	public void setPhoneCons(String phoneCons) {
		this.phoneCons = phoneCons;
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
	public Concessionnaire(Long idCons, String libelleCons, String phoneCons, List<Adresse> adresses,
			List<Marque> marques) {
		super();
		this.idCons = idCons;
		this.libelleCons = libelleCons;
		this.phoneCons = phoneCons;
		this.adresses = adresses;
		this.marques = marques;
	}
	@Override
	public String toString() {
		return "Concessionnaire [idCons=" + idCons + ", libelleCons=" + libelleCons + ", phoneCons=" + phoneCons
				+ ", adresses=" + adresses + ", marques=" + marques + "]";
	}
	
	
	
}
