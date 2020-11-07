package com.tp.spring.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Concessionnaire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long idCons ;
	private String libelleCons; 
	private int phoneCons;
	
	@OneToMany(mappedBy = "concessionnaire")
	private List<Adresse> adresses;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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

	public int getPhoneCons() {
		return phoneCons;
	}
	public void setPhoneCons(int phoneCons) {
		this.phoneCons = phoneCons;
	}
	
	public List<Adresse> getAdresses() {
		return adresses;
	}
	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}
	public Concessionnaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
