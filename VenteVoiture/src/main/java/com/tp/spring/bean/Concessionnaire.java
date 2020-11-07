package com.tp.spring.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Concessionnaire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long idCons ;
	private String prenomCons; 
	private String nomCons;
	private int phoneCons;
	
	
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
	public String getPrenomCons() {
		return prenomCons;
	}
	public void setPrenomCons(String prenomCons) {
		this.prenomCons = prenomCons;
	}
	public String getNomCons() {
		return nomCons;
	}
	public void setNomCons(String nomCons) {
		this.nomCons = nomCons;
	}
	public int getPhoneCons() {
		return phoneCons;
	}
	public void setPhoneCons(int phoneCons) {
		this.phoneCons = phoneCons;
	}
	public Concessionnaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
