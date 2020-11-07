package com.tp.spring.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long idCl ;
	private String PrenomCl; 
	private String nomCl;
	private int phoneCl;
	private String mailCl;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getIdCl() {
		return idCl;
	}
	public void setIdCl(Long idCl) {
		this.idCl = idCl;
	}
	public String getPrenomCl() {
		return PrenomCl;
	}
	public void setPrenomCl(String PrenomCl) {
		this.PrenomCl = PrenomCl;
	}
	public String getNomCl() {
		return nomCl;
	}
	public void setNomCl(String nomCl) {
		this.nomCl = nomCl;
	}
	public int getPhoneCl() {
		return phoneCl;
	}
	public void setPhoneCl(int phoneCl) {
		this.phoneCl = phoneCl;
	}
	
	public String getMailCl() {
		return mailCl;
	}
	public void setMailCl(String mailCl) {
		this.mailCl = mailCl;
	}


	public Client() {
		super();
	}

}
